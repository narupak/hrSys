package com.example.lenovo.hr_team_7;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class DataViewHolder_pa extends RecyclerView.ViewHolder {
    TextView text;
    TextView text2;
    TextView text3;
    TextView text4;
    TextView text5;
    TextView text6;
    TextView text7;
    TextView text8;
    TextView text9;

    public DataViewHolder_pa(View itemView) {
        super(itemView);
        text = itemView.findViewById(R.id.tv_username);
        text2 = itemView.findViewById(R.id.tv_position);
        text3 = itemView.findViewById(R.id.tv_status);
        text4 = itemView.findViewById(R.id.tv_timein);
        text5 = itemView.findViewById(R.id.tv_timeout);
        text6 = itemView.findViewById(R.id.tv_history);
        text7 = itemView.findViewById(R.id.tv_history2);
        text8 = itemView.findViewById(R.id.tv_sum);
        text9 = itemView.findViewById(R.id.tv_sum2);
    }
}
