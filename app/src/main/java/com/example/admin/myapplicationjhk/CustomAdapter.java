package com.example.admin.myapplicationjhk;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.admin.myapplicationjhk.databinding.CellBinding;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<ShortWeather> mData;
    private Context context;


    public CustomAdapter(List<ShortWeather> mData, Context context) {
        this.mData = mData;
        this.context = context;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        CellBinding cellBinding;

        public MyViewHolder(CellBinding cellBinding) {
            super(cellBinding.getRoot());
            this.cellBinding = cellBinding;
        }

        public CellBinding getCellBinding() {
            return cellBinding;
        }

        public void setCellBinding(CellBinding cellBinding) {
            this.cellBinding = cellBinding;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CellBinding cellBinding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.cell, parent, false);
        return new MyViewHolder(cellBinding);


    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyViewHolder viewHolder1 = (MyViewHolder) holder;
        viewHolder1.getCellBinding().setShortweather(mData.get(position));

        viewHolder1.getCellBinding().executePendingBindings();


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}