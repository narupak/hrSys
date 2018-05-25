package com.example.lenovo.hr_team_7;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.VectorDrawable;
import android.support.annotation.ColorRes;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<LeaveViewHolder> {
    private DataCollectionDao dao;
    private Context mContext;
    private List<DataDao> data = new ArrayList<>();

    String id;


    RVAdapter(DataCollectionDao dao, String id) {
        this.dao = dao;
        this.id = id;

        for (DataDao gg : dao.getData_flow()) {
            if (id.equals(gg.getApfp_bill_id())) {
                data.add(gg);
            }
        }


    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public LeaveViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        mContext = viewGroup.getContext();
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_timeline, viewGroup, false);
        LeaveViewHolder pvh = new LeaveViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(LeaveViewHolder leaveViewHolder, int i) {

        if(data.get(i).getApfp_status().equals("Y")){
            leaveViewHolder.time_marker.setMarker(new VectorDrawableUtils().getDrawable(mContext,
                    R.drawable.ic_brightness, R.color.Green));
        }else {
            leaveViewHolder.time_marker.setMarker(new VectorDrawableUtils().getDrawable(mContext,
                    R.drawable.ic_brightness, R.color.red));
        }


        leaveViewHolder.txt1.setText("สถานะดำเนินการ: " + data.get(i).getApfp_status_name());
        leaveViewHolder.txt2.setText("ผู้ดำเนินการ: " + data.get(i).getName());
        leaveViewHolder.txt3.setText("ตำแหน่ง: " + data.get(i).getApfp_apdept_name());
        leaveViewHolder.txt4.setText("วันที่ดำเนินการ: " + data.get(i).getApfp_approve_date());
        leaveViewHolder.txt5.setText(data.get(i).getApfp_seq());

//        if(dao.getData_flow().get(i).getApfp_status() == "Y") {
//            Log.d("onBindViewHolder","sssss"+dao.getData_flow().get(i).getApfp_status());
//            leaveViewHolder.time_marker.setMarker(new VectorDrawableUtils().getDrawable(mContext,
//                    R.drawable.ic_brightness, R.color.Green));
//        }
//        if(dao.getData_flow().get(i).getApfp_bill_id().equals(id)){
//
//            leaveViewHolder.txt1.setText("สถานะดำเนินการ: " + dao.getData_flow().get(i).getApfp_status_name());
//            leaveViewHolder.txt2.setText("ผู้ดำเนินการ: " + dao.getData_flow().get(i).getName());
//            leaveViewHolder.txt3.setText("ตำแหน่ง: " + dao.getData_flow().get(i).getApfp_apdept_name());
//            leaveViewHolder.txt4.setText("วันที่ดำเนินการ: " + dao.getData_flow().get(i).getApfp_approve_date());
//            leaveViewHolder.txt5.setText(dao.getData_flow().get(i).getApfp_seq());
//
//        }

    }

    @Override
    public int getItemCount() {
//        int count_seq = 0;
//        String seq = "7";
//        for(int i = 0;i<dao.getData_flow().size();i++){
//            if(dao.getData_flow().get(i).getApfp_bill_id().equals(seq)) {
//                count_seq++;
//            }
//        }
//
//        Log.d("getItemCount","ssssss"+count_seq);
        //return count_seq;


        return data.size();
    }


}


