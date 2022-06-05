package com.example.physicsdatareview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import org.jetbrains.annotations.NotNull;

public class TopicItem extends ConstraintLayout {

    TextView topicNumberTextView;
    TextView topicNameTextView;

    public TopicItem(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attrs) {
        super(context, attrs);

        //inflate layout file
        LayoutInflater inflater = LayoutInflater.from(context);
        inflater.inflate(R.layout.topic_item, this, true);

        //connect views
        topicNumberTextView = findViewById(R.id.topic_number_textview);
        topicNameTextView = findViewById(R.id.topic_name_textview);

    }
}
