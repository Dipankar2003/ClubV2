package com.example.cms_club_ver_1;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.denzcoskun.imageslider.ImageSlider;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import ru.embersoft.expandabletextview.ExpandableTextView;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    ArrayList<event> list;
    public OnEventClickListener listener;


    public Adapter(ArrayList<event> list, OnEventClickListener listener) {
        this.list = list;
        this.listener = listener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.event_row,parent,false);
        return new Adapter.MyViewHolder(view);    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.textEventName.setText(list.get(position).getName());
        holder.textDate.setText(list.get(position).getDate());
        holder.expandableDescription.setText(list.get(position).getDescription());



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textEventName;
        TextView textDate;
        ExpandableTextView expandableDescription;

        //
        ImageSlider imageSlider;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textEventName = itemView.findViewById(R.id.eventName);
            textDate = itemView.findViewById(R.id.date);
            expandableDescription = itemView.findViewById(R.id.expandable_description);
            imageSlider=itemView.findViewById(R.id.image_slider);

        }
    }
}
