package com.example.cityguidedashboard.helperclasses.homeadapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cityguidedashboard.R;

import java.util.ArrayList;

public class MostViewedAdpater extends RecyclerView.Adapter<MostViewedAdpater.MostViewedViewHolder>{

        ArrayList<MostViewedHelperClass> mostViewedLocations;

        @NonNull
        @Override
        public MostViewedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.most_viewed_card_design, parent, false);
            MostViewedViewHolder mostViewedViewHolder = new MostViewedViewHolder(view);
            return mostViewedViewHolder;    }

        @Override
        public void onBindViewHolder(@NonNull MostViewedViewHolder holder, int position) {

            MostViewedHelperClass mostViewedHelperClass = mostViewedLocations.get(position);

            holder.image.setImageResource(mostViewedHelperClass.getImage());
            holder.title.setText(mostViewedHelperClass.getTitle());
            holder.rating.setRating(mostViewedHelperClass.getRating());
            holder.desc.setText(mostViewedHelperClass.getDescription());

        }

        @Override
        public int getItemCount() {
            return mostViewedLocations.size();
        }

        public MostViewedAdpater(ArrayList<MostViewedHelperClass> mostViewedLocations) {
            this.mostViewedLocations = mostViewedLocations;
        }

        public static class MostViewedViewHolder extends RecyclerView.ViewHolder {

            ImageView image;
            TextView title, desc;
            RatingBar rating;

            public MostViewedViewHolder(@NonNull View itemView) {
                super(itemView);

                //Hooks
                image = itemView.findViewById(R.id.most_viewed_image);
                title = itemView.findViewById(R.id.most_viewed_title);
                rating = itemView.findViewById(R.id.most_viewed_rating);
                desc = itemView.findViewById(R.id.most_viewed_desc);
            }
        }
    }

