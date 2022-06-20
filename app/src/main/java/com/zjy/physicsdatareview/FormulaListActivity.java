package com.zjy.physicsdatareview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.physicsdatareview.R;

public class FormulaListActivity extends AppCompatActivity {

    RecyclerView formulasRecyclerview;
    FormulaAdapter formulaAdapter;
    ImageButton backButton;
    TextView titleTextView;
    int topicNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formula_list);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        topicNumber = extras.getInt("topic");

        setupViews();
        setupRecyclerview();
        setTitle();
    }

    void setTitle(){
        if (topicNumber==0){
            titleTextView.setText(R.string.all_formulas);
        }else{
            String title = topicNumber + ": " + DataStorage.topicList.get(topicNumber);
            titleTextView.setText(title);
        }

    }

    void setupViews(){
        formulasRecyclerview = findViewById(R.id.formulas_recyclerview);
        backButton = findViewById(R.id.back_button);
        titleTextView = findViewById(R.id.title_textview);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    void setupRecyclerview(){
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        Log.d("TAG", "setupRecyclerview: "+formulasRecyclerview.toString());
        formulasRecyclerview.setLayoutManager(layoutManager);

        formulaAdapter = new FormulaAdapter(this, topicNumber);
        formulasRecyclerview.setAdapter(formulaAdapter);
    }
}