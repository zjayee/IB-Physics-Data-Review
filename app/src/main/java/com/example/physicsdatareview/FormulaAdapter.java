package com.example.physicsdatareview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class FormulaAdapter extends RecyclerView.Adapter<FormulaViewHolder> {

    Context context;
    ArrayList<Formula> formulaList;
    int topicNumber;

    //constructor
    FormulaAdapter(@NonNull Context context, @NonNull int topicNumber){
        this.context = context;
        this.topicNumber = topicNumber;
        ArrayList<Formula> unfilteredFormulaList = DataStorage.formulaList;

        if (topicNumber == 0) {
            formulaList = unfilteredFormulaList;
        }else {
            formulaList = new ArrayList<>();
            for (Formula formula : unfilteredFormulaList) {
                int formulaTopic = (int) Math.floor(formula.subtopic);
                if (formulaTopic == topicNumber){
                    formulaList.add(formula);
                }else if (formulaTopic>topicNumber){
                    return;
                }
            }
        }
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
        Formula previous = new Formula(0,0,"");
        if (position-1>=0) {
            previous = formulaList.get(position - 1);
        }
        holder.formulaImageView.setImageResource(formula.formulaImage);

        String headerText = formula.subtopic+" "+ DataStorage.subtopicMap.get(formula.subtopic);
        holder.headerTextView.setText(headerText);

        if (formula.subtopic != previous.subtopic){
            holder.headerTextView.setVisibility(View.VISIBLE);
            if (formula.subtopic>8){
                holder.headerTextView.setTextColor(ContextCompat.getColor(context, R.color.orange));
            }
        }else{
            holder.headerTextView.setVisibility(View.GONE);
        }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: setup on click listener
                Intent intent = new Intent(context, FormulaDisplayActivity.class);
                intent.putExtra("formula", formula);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return formulaList.size();
    }
}
