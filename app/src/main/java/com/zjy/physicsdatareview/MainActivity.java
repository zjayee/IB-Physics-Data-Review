package com.zjy.physicsdatareview;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.physicsdatareview.R;

public class MainActivity extends AppCompatActivity {

    RecyclerView topicsRecyclerView;
    TopicAdapter topicAdapter;
    ImageButton infoImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataStorage.setContext(this);
        DataStorage.populateSubTopicMap();
        DataStorage.populateFormulaList();

        setupViews();
        setupRecyclerView();

    }

    void setupViews(){
        topicsRecyclerView = findViewById(R.id.topics_recyclerview);
        infoImageButton = findViewById(R.id.info_imagebutton);

        infoImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), InfoActivity.class);
                startActivity(intent);
            }
        });
    }

    void setupRecyclerView(){
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        topicsRecyclerView.setLayoutManager(layoutManager);

        topicAdapter = new TopicAdapter(this);
        topicsRecyclerView.setAdapter(topicAdapter);
    }
}