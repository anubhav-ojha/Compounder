package com.techmaze.compounder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class rv_adapter extends RecyclerView.Adapter<rv_adapter.holder> {

    ArrayList<Integer> displayItems ;

    public rv_adapter(ArrayList<Integer> displayItems) {
        this.displayItems = displayItems;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.single_row,parent,false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
        holder.tv_recyclerView.setText(String.valueOf(displayItems[position]));
    }

    @Override
    public int getItemCount() {
        return 0;
    }


    class holder extends RecyclerView.ViewHolder
    {
        TextView tv_recyclerView ;
        public holder(@NonNull View itemView) {
            super(itemView);
            tv_recyclerView = itemView.findViewById(R.id.tv_recyclerView) ;
        }
    }
}
