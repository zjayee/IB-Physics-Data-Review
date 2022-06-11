package com.example.physicsdatareview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class FormulaAdapter extends RecyclerView.Adapter<FormulaViewHolder> {

    Context context;
    ArrayList<Formula> formulaList;
    double currentSubtopic = 0;

    //constructor
    FormulaAdapter(@NonNull Context context){
        this.context = context;
        //TODO: set formulaList
    }

    @NonNull
    @NotNull
    @Override
    public FormulaViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        //method called whenever I need to create a new viewholder
        LayoutInflater inflater = LayoutInflater.from(context);
        View itemView = inflater.inflate(R.layout.formula_item, parent, false);
        FormulaViewHolder viewHolder = new FormulaViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull FormulaViewHolder holder, int position) {

        Formula formula = formulaList.get(position);
        holder.formulaImageView.setImageResource(formula.formulaImage);

        String headerText = formula.subtopic+" "+ DataStorage.subtopicMap.get(formula.subtopic);
        holder.headerTextView.setText(headerText);

        if (formula.subtopic != currentSubtopic){
            currentSubtopic = formula.subtopic;
            holder.headerTextView.setVisibility(View.VISIBLE);
        }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: setup on click listener
            }
        });
    }

    @Override
    public int getItemCount() {
        return formulaList.size();
    }
}
