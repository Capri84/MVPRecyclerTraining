package com.example.capri.mvprecyclertraining.View;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.capri.mvprecyclertraining.Contract;
import com.example.capri.mvprecyclertraining.Model.Item;
import com.example.capri.mvprecyclertraining.R;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private List<Item> items;

    public RecyclerAdapter(List<Item> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);
        return new RecyclerAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder viewHolder, int position) {
        final Item currentItem = items.get(position);
        viewHolder.setTitle(currentItem.getTitle());
        viewHolder.setPicture(currentItem.getImageResourceId());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detailsIntent = new Intent(v.getContext(), DetailsActivity.class);
                detailsIntent.putExtra(Item.class.getSimpleName(), currentItem);
                v.getContext().startActivity(detailsIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements Contract.RepositoryRowView {
        ImageView pictureImageView;
        TextView titleTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            pictureImageView = itemView.findViewById(R.id.picture);
            titleTextView = itemView.findViewById(R.id.title);
        }

        @Override
        public void setTitle(String title) {
            titleTextView.setText(title);
        }

        @Override
        public void setPicture(int imageResourceId) {
            pictureImageView.setImageResource(imageResourceId);
        }
    }
}