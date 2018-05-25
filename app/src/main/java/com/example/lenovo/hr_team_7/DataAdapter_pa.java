package com.example.lenovo.hr_team_7;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DataAdapter_pa extends RecyclerView.Adapter<DataViewHolder_pa>{
    private DataCollectionDao_pa photo;

    public DataAdapter_pa(DataCollectionDao_pa photo) {
        this.photo = photo;
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

        holder.text.setText(photo.getProfile().get(position).getNAME());
        holder.text2.setText(photo.getProfile().get(position).getHire_name());
    }


    @Override
    public int getItemCount() {
        return  photo.getProfile().size();
    }

}
