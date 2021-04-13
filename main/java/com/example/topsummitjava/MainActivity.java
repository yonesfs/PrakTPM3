package com.example.topsummitjava;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import static com.example.topsummitjava.R.id.rvGunung;
import static com.example.topsummitjava.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private final ArrayList<ListGunung> listGunung = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        setTitle("TopSummitJava");

        rv = findViewById(rvGunung);
        rv.setHasFixedSize(true);
        listGunung.addAll(Glide.getListData());
        showRecyclerCardView();
    }

    private void showRecyclerCardView() {
        rv.setLayoutManager(new LinearLayoutManager(this));
        DetailContent agentAdapter = new DetailContent(listGunung,this);
        rv.setAdapter(agentAdapter);

    }
}