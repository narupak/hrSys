package com.example.lenovo.hr_team_7;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AdapterService extends RecyclerView.Adapter<DataCollectionDaoViewHolder> {

    private DataCollectionDao dataDaos;

    public AdapterService(DataCollectionDao dataDaos) {
        this.dataDaos = dataDaos;
    }




//    AdapterService(List<DataCollectionDao> dataDaos){
//        this.dataDaos = dataDaos;
//    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public DataCollectionDaoViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_cardview, viewGroup, false);
        DataCollectionDaoViewHolder pvh = new DataCollectionDaoViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(DataCollectionDaoViewHolder dataCollectionDaoViewHolder, final int i) {

        ////// Leave Type //////
        dataCollectionDaoViewHolder.TxtDoc.setText(dataDaos.getData().get(i).getLeaveName());

        ////// Leave Status //////
        dataCollectionDaoViewHolder.TxtStatus.setText(dataDaos.getData().get(i).getLhis_status_name());

        //////////////////////// Drawable Type///////////////////////////
        if(dataDaos.getData().get(i).getLhis_status().equals(dataDaos.getData().get(i).getLhis_status())) {
            if (dataDaos.getData().get(i).getLhis_status().equals("Y")) {
                dataCollectionDaoViewHolder.ImgStatus.setImageResource(R.drawable.circle_layout);
            }

            if (dataDaos.getData().get(i).getLhis_status().equals("W")) {
                dataCollectionDaoViewHolder.ImgStatus.setImageResource(R.drawable.circle_layout1);
            }

            if (dataDaos.getData().get(i).getLhis_status().equals("E")) {
                dataCollectionDaoViewHolder.ImgStatus.setImageResource(R.drawable.circle_layout2);
            }

            if (dataDaos.getData().get(i).getLhis_status().equals("1")) {
                dataCollectionDaoViewHolder.ImgStatus.setImageResource(R.drawable.circle_layout1);
            }

            if (dataDaos.getData().get(i).getLhis_status().equals("C")) {
                dataCollectionDaoViewHolder.ImgStatus.setImageResource(R.drawable.circle_layout3);
            }

            if (dataDaos.getData().get(i).getLhis_status().equals("N")) {
                dataCollectionDaoViewHolder.ImgStatus.setImageResource(R.drawable.circle_layout3);
            }
        }////// End Drawable Type///////

        ///////////////////////Photo Type/////////////////////////////
        if(dataDaos.getData().get(i).getLhis_leave_id().equals(dataDaos.getData().get(i).getLhis_leave_id())) {
            if (dataDaos.getData().get(i).getLhis_leave_id().equals("1")) {
                dataCollectionDaoViewHolder.thumbnail.setImageResource(R.mipmap.sick2);
            }

            if (dataDaos.getData().get(i).getLhis_leave_id().equals("3")) {
                dataCollectionDaoViewHolder.thumbnail.setImageResource(R.mipmap.busy2);
            }

            if (dataDaos.getData().get(i).getLhis_leave_id().equals("15")) {
                dataCollectionDaoViewHolder.thumbnail.setImageResource(R.mipmap.holiday2);
            }

            if (dataDaos.getData().get(i).getLhis_leave_id().equals("5")) {
                dataCollectionDaoViewHolder.thumbnail.setImageResource(R.mipmap.church2);
            }

            if (dataDaos.getData().get(i).getLhis_leave_id().equals("10")) {
                dataCollectionDaoViewHolder.thumbnail.setImageResource(R.mipmap.married2);
            }

            if (dataDaos.getData().get(i).getLhis_leave_id().equals("2")) {
                dataCollectionDaoViewHolder.thumbnail.setImageResource(R.mipmap.baby2);
            }

            if (dataDaos.getData().get(i).getLhis_leave_id().equals("4")) {
                dataCollectionDaoViewHolder.thumbnail.setImageResource(R.mipmap.hobby2);
            }
        }/////// End photo

             ///////////// Start Date ///////////
                dataCollectionDaoViewHolder.TxtStartDate.setText(dataDaos.getData().get(i).getLhis_start_date());

            ///////////// End Date ///////////
                dataCollectionDaoViewHolder.TxtEndDate.setText(dataDaos.getData().get(i).getLhis_end_date());
    }

    @Override
    public int getItemCount() {
        return  dataDaos.getData().size();
    }



}