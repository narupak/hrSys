package com.example.lenovo.hr_team_7;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class DataViewHolder_pa extends RecyclerView.ViewHolder {
    TextView text;
    TextView text2;
    TextView time_now;
    TextView time_start;
    TextView time_end;
    TextView time_not_attention;
    TextView time_all2;
    TextView time_all;


    public DataViewHolder_pa(View itemView) {
        super(itemView);
        text = itemView.findViewById(R.id.tv_username);
        text2 = itemView.findViewById(R.id.tv_position);
        time_now = itemView.findViewById(R.id.tv_status);
        time_start = itemView.findViewById(R.id.tv_history);
        time_end = itemView.findViewById(R.id.tv_history2);
        time_not_attention = itemView.findViewById(R.id.tv_sum2);
        time_all = itemView.findViewById(R.id.tv_sumall2);
        time_all2 = itemView.findViewById(R.id.tv_sumall);
    }
}
