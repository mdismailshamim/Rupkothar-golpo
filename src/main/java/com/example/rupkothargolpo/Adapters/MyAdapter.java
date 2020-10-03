package com.example.rupkothargolpo.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rupkothargolpo.Activities.ShowActivity;
import com.example.rupkothargolpo.R;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    Context mContext;
    List<Paragraph> paragraphList;

    public MyAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public void setListQuotes(ArrayList<Paragraph> paragraphList) {
        this.paragraphList = paragraphList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder,final int position) {
        holder.titleTv.setText(paragraphList.get(position).getTitle());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent singleIntent = new Intent(mContext, ShowActivity.class);
                singleIntent.putExtra(ShowActivity.EXTRA_SHOW_PAGE,paragraphList.get(position));
                mContext.startActivity(singleIntent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return paragraphList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView titleTv;
        private LinearLayout linearLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTv = itemView.findViewById(R.id.titleTv);
            linearLayout = itemView.findViewById(R.id.linearLayout);
        }
    }
}
