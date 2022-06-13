package com.example.physicsdatareview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

public class FormulaListActivity extends AppCompatActivity {

    RecyclerView formulasRecyclerview;
    FormulaAdapter formulaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formula_list);

        setupViews();
        setupRecyclerview();
    }

    void setupViews(){
        formulasRecyclerview = findViewById(R.id.formulas_recyclerview);
    }

    void setupRecyclerview(){
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        Log.d("TAG", "setupRecyclerview: "+formulasRecyclerview.toString());
        formulasRecyclerview.setLayoutManager(layoutManager);

        formulaAdapter = new FormulaAdapter(this);
        formulasRecyclerview.setAdapter(formulaAdapter);
    }
}