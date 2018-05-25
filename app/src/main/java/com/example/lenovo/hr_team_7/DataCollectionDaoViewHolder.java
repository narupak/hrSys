package com.example.lenovo.hr_team_7;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DataCollectionDaoViewHolder extends RecyclerView.ViewHolder {

    TextView cvID;
    TextView TxtDoc;
    TextView TxtStartDate;
    TextView TxtEndDate;
    TextView TxtStatus;
    ImageView ImgStatus;
    ImageView thumbnail;

    DataCollectionDaoViewHolder(View itemView) {
        super(itemView);

        cvID = (TextView) itemView.findViewById(R.id.cvID);
        TxtDoc = (TextView) itemView.findViewById(R.id.TxtDoc);
        TxtStartDate = (TextView) itemView.findViewById(R.id.TxtStartDate);
        TxtEndDate = (TextView) itemView.findViewById(R.id.TxtEndDate);
        TxtStatus = (TextView)itemView.findViewById(R.id.TxtStatus);
        ImgStatus = (ImageView) itemView.findViewById(R.id.ImgStatus);
        thumbnail = (ImageView) itemView.findViewById(R.id.thumbnail);
    }
}



