package com.zjy.physicsdatareview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.zjy.physicsdatareview.R;

import org.w3c.dom.Text;

public class InfoActivity extends AppCompatActivity {

    TextView bugTextView;
    TextView suggestionTextView;
    TextView coffeeTextView;
    ImageButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        setupHyperlink();
        setupBackButton();
    }

    void setupBackButton(){
        backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    void setupHyperlink(){
        bugTextView = findViewById(R.id.info_bug_textview);
        suggestionTextView = findViewById(R.id.info_suggestion_textview);
        coffeeTextView = findViewById(R.id.info_coffee_textview);

        bugTextView.setMovementMethod(LinkMovementMethod.getInstance());
        suggestionTextView.setMovementMethod(LinkMovementMethod.getInstance());
        coffeeTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}