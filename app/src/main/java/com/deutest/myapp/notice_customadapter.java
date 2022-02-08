package com.deutest.myapp;

import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Dictionary;

public class notice_customadapter extends RecyclerView.Adapter<notice_customadapter.CustomViewHolder>{

    private ArrayList<notice_dictionary> mList;

    public class CustomViewHolder extends RecyclerView.ViewHolder{
        protected TextView list;

        public CustomViewHolder(View view){
            super(view);
            this.list = (TextView) view.findViewById(R.id.list_item);
        }
    }

    public notice_customadapter(ArrayList<notice_dictionary> list){
        this.mList = list;
    }

    public CustomViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType){
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list, viewGroup, false);

        CustomViewHolder viewHolder = new CustomViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {

        holder.list.setTextSize(TypedValue.COMPLEX_UNIT_SP, 25);

        holder.list.setGravity(Gravity.CENTER);

        holder.list.setText(mList.get(position).getList());
    }

    @Override
    public int getItemCount() {
        return (null != mList ? mList.size() : 0);
    }
}
