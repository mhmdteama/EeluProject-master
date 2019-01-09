package com.mhmd.eeluproject.others;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.mhmd.eeluproject.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class CallAdapter extends RecyclerView.Adapter<CallAdapter.CallsViewHolder> {

    private ArrayList<Call_items> ourcallitems;

    public  CallAdapter(ArrayList<Call_items>call_items)
    {
        ourcallitems = call_items;
    }

    public class CallsViewHolder extends RecyclerView.ViewHolder {

        TextView callname,callnum;
        CircleImageView callimg;
        public CallsViewHolder(View itemView) {
            super(itemView);

            callname = itemView.findViewById(R.id.caller_name);
            callnum = itemView.findViewById(R.id.caller_num);
            callimg = itemView.findViewById(R.id.caller_img);
        }
    }

    @NonNull
    @Override
    public CallsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.call_num_items,parent,false);

        return new CallsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CallsViewHolder holder, int position) {

        Call_items call_items = ourcallitems.get(position);

        holder.callname.setText(call_items.getCallername());
        holder.callnum.setText(call_items.getCallernum());
        holder.callimg.setImageResource(call_items.getCallerimg());

    }

    @Override
    public int getItemCount() {
        return ourcallitems.size();
    }


}
