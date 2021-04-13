package com.example.topsummitjava;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class DetailContent extends RecyclerView.Adapter<DetailContent.AgentViewHolder> {
    private ArrayList<ListGunung> listGunung;
    private Context context;

    public DetailContent(ArrayList<ListGunung> dataList, Context context) {
        this.listGunung = dataList;
        this.context = context;
    }
    @NonNull
    @Override
    public AgentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_list_gunung, parent, false);
        return new AgentViewHolder(view);
    }

    public void onBindViewHolder(AgentViewHolder holder, int position) {
        int image    = listGunung.get(position).getImage();
        String name     = listGunung.get(position).getName();
        String summary  = listGunung.get(position).getSummary();

        Glide.with(holder.itemView.getContext())
                .load(listGunung.get(position).getImage())
                .into(holder.image);

        holder.name.setText(name);
        holder.summary.setText(summary);

        try {

            holder.btnPreview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openDetailActivity(image, name, summary);
                }
            });

            holder.btnShare.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    shareGunung(name, String.valueOf(image), summary);
                }
            });

        }catch (Exception e) {
            Log.d("DetailActivity", "MyErr : " + e);
        }
    }

    @Override
    public int getItemCount() {
        return (listGunung != null) ? listGunung.size() : 0;
    }
    public static class AgentViewHolder extends RecyclerView.ViewHolder {
        private final ImageView image;
        private final TextView name, summary;
        private final Button btnPreview, btnShare;

        public AgentViewHolder(View itemView) {
            super(itemView);
            name       = (TextView) itemView.findViewById(R.id.mountain_name);
            image      = (ImageView) itemView.findViewById(R.id.mountain_image);
            summary    = (TextView) itemView.findViewById(R.id.mountain_summary);
            btnPreview = (Button) itemView.findViewById(R.id.btnPreview);
            btnShare   = (Button) itemView.findViewById(R.id.btnShare);
        }
    }

    public void openDetailActivity(int image, @NonNull String... Gunung) {
        Intent i = new Intent(context, DetailActivity.class);
        i.putExtra("IMAGE_KEY", Gunung[3]);
        i.putExtra("NAME_KEY", Gunung[1]);
        i.putExtra("SUMMARY_KEY", Gunung[2]);
        context.startActivity(i);
    }

    public void shareGunung(@NonNull String ...Gunung) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, Gunung[0] + "\n\n" + Gunung[1]);
        sendIntent.setType("text/plain");

        Intent shareIntent = Intent.createChooser(sendIntent, null);
        context.startActivity(shareIntent);
    }
}