package com.arhamapps.investapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

public class RecylerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<DataItem> data = Collections.emptyList();
    private Context context;
    private LayoutInflater inflater;

    // create constructor to innitilize context and data sent from FolioActivity
    public RecylerAdapter(Context context, List<DataItem> data) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.data = data;
    }

    // Inflate the layout when viewholder created
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.data_item, parent, false);
        MyHolder holder = new MyHolder(view);
        return holder;
    }

    // Bind data
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        // Get current position of item in recyclerview to bind data and assign values from list
        MyHolder myHolder = (MyHolder) holder;
        DataItem current = data.get(position);
        String temp = current.schemeName.replaceAll("\"", "").trim();
        myHolder.itemname.setText(temp);
    }

    // return total item from List
    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyHolder extends RecyclerView.ViewHolder {
        TextView itemname;

        // create constructor to get widget reference
        public MyHolder(View itemView) {
            super(itemView);
            itemname = (TextView) itemView.findViewById(R.id.itemNames);
        }

    }
}
