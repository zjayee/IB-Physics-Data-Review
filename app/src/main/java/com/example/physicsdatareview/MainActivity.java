package com.example.physicsdatareview;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RecyclerView topicsRecyclerView;
    TopicAdapter topicAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViews();
        setupRecyclerView();

    }

    void setupViews(){
        topicsRecyclerView = findViewById(R.id.topics_recyclerview);
    }

    void setupRecyclerView(){
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        topicsRecyclerView.setLayoutManager(layoutManager);

        topicAdapter = new TopicAdapter(this);
        topicsRecyclerView.setAdapter(topicAdapter);
    }
}