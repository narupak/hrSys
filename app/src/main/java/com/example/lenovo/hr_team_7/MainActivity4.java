package com.example.lenovo.hr_team_7;

import com.example.lenovo.hr_team_7.Item;

import retrofit2.Callback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lenovo.hr_team_7.ApproveList;
import com.example.lenovo.hr_team_7.HttpManager;
import com.example.lenovo.hr_team_7.Item;
import com.example.lenovo.hr_team_7.ItemAdapter;
import com.example.lenovo.hr_team_7.R;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.support.v4.content.ContextCompat.startActivity;

public class MainActivity4 extends AppCompatActivity {

    RecyclerView rvItem;
    CardView cvItem;
    ItemAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        rvItem = (RecyclerView) findViewById(R.id.rvItem);

        cvItem = (CardView) findViewById(R.id.cvItem);


        rvItem.setHasFixedSize(true);

        LinearLayoutManager manager = new LinearLayoutManager(this);
        rvItem.setLayoutManager(manager);

        getServiceDatacardview();



    }

    private void getServiceDatacardview() {
        Call<ApproveList> call = HttpManager.getInstance().getService().getApproveListDataList();
        call.enqueue(new Callback<ApproveList>() {
            @Override
            public void onResponse(Call<ApproveList> call, Response<ApproveList> response) {
                if (response.isSuccessful()) {
                    ApproveList approveLists = response.body();
                    //generatedDummy(approveLists);
                    ArrayList<Item> itemList = generatedDummy(approveLists);

                    ItemAdapter adapter = new ItemAdapter(getApplicationContext() ,itemList);
                    rvItem.setAdapter(adapter);

                    Log.d("getServiceData", "if ::" + approveLists.getRs_hl().size());
                } else {
                    Log.d("getServiceData", "else ::" + response.message());
                }
            }

            @Override
            public void onFailure(Call<ApproveList> call, Throwable t) {
                Log.d("getServiceData", "onFailure ::" + t);
            }
        });
    }

    private ArrayList<Item> generatedDummy(ApproveList approveLists) {
        ArrayList<Item> list = new ArrayList<>();
        for (int i = 0; i < approveLists.getRs_hl().size(); i++) {
            Item item = new Item();
            item.id = i;
            item.nameleave = approveLists.getRs_hl().get(i).getPf_name() + approveLists.getRs_hl().get(i).getPs_fname() + " " + approveLists.getRs_hl().get(i).getPs_lname();
            item.typeleave = approveLists.getRs_hl().get(i).getLeave_name();
            item.numleave = approveLists.getRs_hl().get(i).getLhis_num_day()+"  วัน";
            item.duraleave = approveLists.getRs_hl().get(i).getLhis_start_date() + "  -  " + approveLists.getRs_hl().get(i).getLhis_end_date();
            item.dayleave = approveLists.getRs_hl().get(i).getLhis_write_date();
            item.address_write = approveLists.getRs_hl().get(i).getLhis_write_place();
            item.name = approveLists.getRs_hl().get(i).getPf_name() + approveLists.getRs_hl().get(i).getPs_fname() + " " + approveLists.getRs_hl().get(i).getPs_lname();
            item.position = approveLists.getRs_hl().get(i).getDept_name();
            item.topic = approveLists.getRs_hl().get(i).getLhis_topic();
            item.call = approveLists.getRs_hl().get(i).getLhis_tell();
            item.postscript = approveLists.getRs_hl().get(i).getLhis_conscription();
            item.address = approveLists.getRs_hl().get(i).getLhis_place_name() + " " + approveLists.getRs_hl().get(i).getLhis_place_name_2();
            item.img = "http://enadcity.org/enadcity/wp-content/uploads/2017/02/profile-pictures.png";
            item.ps_id_leave = approveLists.getRs_hl().get(i).getPs_id_leave();
            item.alSeq = approveLists.getRs_hl().get(i).getLhis_status();
            item.billId = approveLists.getRs_hl().get(i).getBillId();
            item.psIdapv = approveLists.getPsIdapv();
            list.add(item);
        }
        return list;
    }
}
