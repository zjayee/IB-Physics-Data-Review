package com.example.physicsdatareview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class TopicViewHolder extends RecyclerView.ViewHolder {

    View itemView;
    TextView topicNumberTextView;
    TextView topicNameTextView;
    ImageView circleConnectorImageView;
    ImageView circleTopImageView;
    ImageView circleBottomImageView;

    public TopicViewHolder(@NonNull @NotNull View itemView) {
        super(itemView);

        this.itemView = itemView;
        topicNumberTextView = itemView.findViewById(R.id.topic_number_textview);
        topicNameTextView = itemView.findViewById(R.id.topic_name_textview);
        circleConnectorImageView = itemView.findViewById(R.id.circle_connector);
        circleTopImageView = itemView.findViewById(R.id.circle_top);
        circleBottomImageView = itemView.findViewById(R.id.circle_bottom);
    }

}
