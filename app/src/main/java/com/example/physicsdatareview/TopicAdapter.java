package com.example.physicsdatareview;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.core.widget.ImageViewCompat;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class TopicAdapter extends RecyclerView.Adapter<TopicViewHolder> {

   Context context;
   ArrayList<String> topicList;

    //constructor
    TopicAdapter(@NonNull Context context){
        this.context = context;
        this.topicList = DataStorage.topicList;
        topicList.add(0, "All Formulas");
    }

    @NonNull
    @NotNull
    @Override
    public TopicViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        //method called whenever I need to create a new viewholder
        LayoutInflater inflater = LayoutInflater.from(context);
        View itemView = inflater.inflate(R.layout.topic_item, parent, false);
        TopicViewHolder viewHolder = new TopicViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull TopicViewHolder holder, int position) {
        //called whenever an existing ViewHolder needs to be re-used
        //at this point we need to repopulate the viewholder
        int topicNumber = position;
        String topicName = topicList.get(position);

        //set all formulas button
        if (position==0) {
            holder.allFormulasTextView.setVisibility(View.VISIBLE);
            holder.aIcon.setVisibility(View.VISIBLE);
            holder.topicNumberTextView.setVisibility(View.GONE);
            holder.topicNameTextView.setVisibility(View.GONE);
            holder.circleConnectorImageView.setVisibility(View.GONE);
        }

        //set name and number
        holder.topicNumberTextView.setText(Integer.toString(topicNumber));
        holder.topicNameTextView.setText(topicName);

        //set top and bottom circle visibility
        if (topicNumber==1){
            holder.circleTopImageView.setVisibility(View.VISIBLE);
        }else if(topicNumber == 12){
            holder.circleBottomImageView.setVisibility(View.VISIBLE);
        }

        //set colour for HL topics
        if (topicNumber>8){
            ImageViewCompat.setImageTintList(holder.circleConnectorImageView, ColorStateList.valueOf(ContextCompat.getColor(context, R.color.orange)));
            holder.topicNumberTextView.setTextColor(ContextCompat.getColor(context, R.color.orange));
        }


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //open list of formulas for topic
                Intent intent = new Intent(context, FormulaListActivity.class);
                intent.putExtra("topic", topicNumber);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return topicList.size();
    }
}
