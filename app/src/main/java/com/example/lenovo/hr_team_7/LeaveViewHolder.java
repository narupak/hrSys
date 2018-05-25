package com.example.lenovo.hr_team_7;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.github.vipulasri.timelineview.TimelineView;

public class LeaveViewHolder extends RecyclerView.ViewHolder{
    TextView txt_head;

    TextView txt1;
    TextView txt2;
    TextView txt3;
    TextView txt4;
    TextView txt5;
    TimelineView time_marker;

    String text1;
    String text2;
    String text3;
    String text4;


    LeaveViewHolder(View itemView) {
        super(itemView);
        txt1 = (TextView)itemView.findViewById(R.id.txt1);
        txt2 = (TextView) itemView.findViewById(R.id.txt2);
        txt3 = (TextView) itemView.findViewById(R.id.txt3);
        txt4 = (TextView) itemView.findViewById(R.id.txt4);
        txt5 = (TextView) itemView.findViewById(R.id.txt5);
        time_marker = (TimelineView) itemView.findViewById(R.id.time_marker);
//        txt_head = (TextView)main.findViewById(R.id.txt_head);

    }
}
