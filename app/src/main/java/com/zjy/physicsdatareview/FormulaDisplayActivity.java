package com.zjy.physicsdatareview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.physicsdatareview.R;

public class FormulaDisplayActivity extends AppCompatActivity {


    Formula formula;
    TextView titleTextView;
    ImageButton backButton;
    ImageView formulaImageView;
    TextView explanationTextView;
    TextView formulaHeaderTextView;
    TextView explanationHeaderTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formula_display);

        //Get formula from intent
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        formula = (Formula)extras.getSerializable("formula");


        setupViews();
        setFormula();
    }

    void setFormula(){
        String title = formula.subtopic+" "+ DataStorage.subtopicMap.get(formula.subtopic);
        titleTextView.setText(title);
        formulaImageView.setImageResource(formula.formulaImage);
        explanationTextView.setText(formula.explanation);

        if(formula.subtopic>8){
            explanationHeaderTextView.setTextColor(ContextCompat.getColor(this, R.color.orange));
            formulaHeaderTextView.setTextColor(ContextCompat.getColor(this, R.color.orange));
        }
    }

    void setupViews(){
        titleTextView = findViewById(R.id.title_textview);
        backButton = findViewById(R.id.back_button);
        formulaImageView = findViewById(R.id.formula_imageview);
        explanationTextView = findViewById(R.id.explanation_textview);
        formulaHeaderTextView = findViewById(R.id.formulas_textview);
        explanationHeaderTextView = findViewById(R.id.explanation_header_textview);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }


}