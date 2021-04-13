package com.example.topsummitjava;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        ImageView imageTxt  = findViewById(R.id.mountain_image);
        TextView nameTxt    = findViewById(R.id.mountain_name);
        TextView summaryTxt = findViewById(R.id.mountain_summary);

        Bundle extras = getIntent().getExtras();

        String images  = extras.getString("IMAGE_KEY");
        String name    = extras.getString("NAME_KEY");
        String summary = extras.getString("SUMMARY_KEY");

        setTitle("Detail "+ name);
        imageTxt.setImageURI(Uri.parse(images));
        nameTxt.setText(name);
        summaryTxt.setText(summary);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}
