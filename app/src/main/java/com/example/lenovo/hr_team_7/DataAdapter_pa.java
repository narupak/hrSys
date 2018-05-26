package com.example.lenovo.hr_team_7;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DataAdapter_pa extends RecyclerView.Adapter<DataViewHolder_pa>{
    private DataCollectionDao_pa photo;
    private Context context;

    public DataAdapter_pa(DataCollectionDao_pa photo,Context context) {
        this.photo = photo;
        this.context = context;
    }

    @Override
    public DataViewHolder_pa onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.from(parent.getContext())
                .inflate(R.layout.card_view_pa, parent, false);
        DataViewHolder_pa pv = new DataViewHolder_pa(view);
        return pv;
    }

    @Override
    public void onBindViewHolder(DataViewHolder_pa holder, final int position) {
        holder.btn_work.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,work_pa.class);
                context.startActivity(intent);
            }
        });

        holder.btn_notwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,not_work_pa.class);
                context.startActivity(intent);
            }
        });

        holder.text.setText(photo.getProfile().get(position).getNAME());
        holder.text2.setText(photo.getProfile().get(position).getHire_name());
        holder.time_now.setText(photo.getProfile().get(position).getTime_now());
        holder.time_start.setText(photo.getProfile().get(position).getTime_start());
        holder.time_end.setText(photo.getProfile().get(position).getTime_end());
        holder.time_not_attention.setText(photo.getCount_NOT_attention_person().get(position).getSum_no_att());
        holder.time_all.setText(photo.getCount_NOT_attention_person().get(position).getSum_no_att());
        holder.time_all2.setText(photo.getCount_NOT_attention_person().get(position).getSum_no_att());
    }


    @Override
    public int getItemCount() {
        return  photo.getProfile().size();
    }

}
