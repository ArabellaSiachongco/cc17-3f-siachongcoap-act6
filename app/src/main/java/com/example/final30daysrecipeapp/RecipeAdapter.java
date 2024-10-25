package com.example.final30daysrecipeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder> {

    private final List<Recipe> recipeList;
    private final Context context;

    public RecipeAdapter(Context context, List<Recipe> recipes) {
        this.context = context;
        this.recipeList = recipes;
    }

    @NonNull
    @Override
    public RecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_day_recipe, parent, false);
        return new RecipeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeViewHolder holder, int position) {
        Recipe recipe = recipeList.get(position);
        holder.dayTitleTextView.setText(recipe.getDayTitle());
        holder.dayHeaderTextView.setText(recipe.getHeaderText());
        holder.dayDescriptionTextView.setText(recipe.getDescriptionText());
        holder.dayImageView.setImageResource(recipe.getImageResId());
    }

    @Override
    public int getItemCount() {
        return recipeList.size();
    }

    public static class RecipeViewHolder extends RecyclerView.ViewHolder {
        TextView dayTitleTextView, dayHeaderTextView, dayDescriptionTextView;
        ImageView dayImageView;

        public RecipeViewHolder(@NonNull View itemView) {
            super(itemView);
            dayTitleTextView = itemView.findViewById(R.id.dayTitleTextView);
            dayHeaderTextView = itemView.findViewById(R.id.dayHeaderTextView);
            dayDescriptionTextView = itemView.findViewById(R.id.dayDescriptionTextView);
            dayImageView = itemView.findViewById(R.id.dayImageView);
        }
    }
}

