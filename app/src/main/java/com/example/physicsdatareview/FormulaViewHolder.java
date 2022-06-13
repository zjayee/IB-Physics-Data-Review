package com.example.physicsdatareview;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class FormulaViewHolder extends RecyclerView.ViewHolder {
    ImageView viewMoreButton;
    TextView headerTextView;
    ImageView formulaImageView;
    View itemView;


    public FormulaViewHolder(@NonNull @NotNull View itemView) {
        super(itemView);
        this.itemView = itemView;
        viewMoreButton = itemView.findViewById(R.id.viewmore_button);
        headerTextView = itemView.findViewById(R.id.header_textview);
        formulaImageView = itemView.findViewById(R.id.formula_imageview);

    }
}
