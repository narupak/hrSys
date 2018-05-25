package com.example.lenovo.hr_team_7;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.lenovo.hr_team_7.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.support.v4.content.ContextCompat.startActivity;

/**
 * Created by Narupak on 14/3/2561.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    private Context context;
    private ArrayList<Item> itemList;


    public ItemAdapter(Context context, ArrayList<Item> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    public void setContext(Context context) {
        this.context = context;
    }


    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        ItemViewHolder itemViewHolder = new ItemViewHolder(view);
        return itemViewHolder;
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, final int position) {
        final Item item = itemList.get(position);
        Picasso.get()
                .load(item.img)
                .placeholder(R.drawable.ic_launcher_background)
                .error(android.R.drawable.stat_notify_error)
                .into(holder.ivImage);
        holder.nameleave.setText(item.nameleave);
        holder.typeleave.setText(item.typeleave);
        holder.numleave.setText(item.numleave);
        holder.duraleave.setText(item.duraleave);
        holder.dayleave.setText(item.dayleave);
        holder.insigniaid.setHint(""+item.id);
        holder.InrLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,Main2Activity.class);
                intent.putExtra("address_write",itemList.get(position).address_write);
                intent.putExtra("name",itemList.get(position).nameleave);
                intent.putExtra("position",itemList.get(position).position);
                intent.putExtra("topic",itemList.get(position).topic);
                intent.putExtra("call",itemList.get(position).call);
                intent.putExtra("postscript",itemList.get(position).postscript);
                intent.putExtra("leavedate",itemList.get(position).duraleave);
                intent.putExtra("numday",itemList.get(position).numleave);
                intent.putExtra("address",itemList.get(position).address);
                intent.putExtra("index",position);
                intent.putExtra("ps_id_leave",itemList.get(position).ps_id_leave);
                intent.putExtra("alSeq",itemList.get(position).alSeq);
                intent.putExtra("billId",itemList.get(position).billId);
                intent.putExtra("billType","leave");
                intent.putExtra("psIdapv",itemList.get(position).psIdapv);
                intent.putExtra("yesB","Y");
                intent.putExtra("noB","N");
                context.startActivity(intent);
                Log.d("onclick","complete" + " "+position);

            }
        });
    }

    @Override
    public int getItemCount() {
        if(itemList != null){
            return itemList.size();
        }
        return 0;
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        public CardView cvItem;
        public TextView nameleave;
        public TextView typeleave;
        public TextView numleave;
        public TextView duraleave;
        public TextView dayleave;
        public ImageView ivImage;
        public TextView insigniaid;
        public Context context;
        public LinearLayout InrLayout;

        public ItemViewHolder(final View itemView){

            super(itemView);

            cvItem = (CardView)itemView.findViewById(R.id.cvItem);
            nameleave = (TextView)itemView.findViewById(R.id.nameleave);
            typeleave = (TextView)itemView.findViewById(R.id.typeleave);
            numleave = (TextView)itemView.findViewById(R.id.numleave);
            duraleave = (TextView)itemView.findViewById(R.id.duraleave);
            dayleave = (TextView)itemView.findViewById(R.id.dayleave);
            ivImage = (ImageView)itemView.findViewById(R.id.img_superman);
            insigniaid = (TextView)itemView.findViewById(R.id.insignia_id);
            InrLayout = (LinearLayout)itemView.findViewById(R.id.linearlayout);

        }
    }

}
