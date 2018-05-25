package com.example.lenovo.hr_team_7;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.vipulasri.timelineview.TimelineView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity3 extends AppCompatActivity {

    RecyclerView RVitem;
//    CardView CVitem;
   // ImageView Txt3
    TextView txt_head;
    TimelineView tl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        RVitem = (RecyclerView)findViewById(R.id.RVitem1);
        RVitem.setHasFixedSize(true);

//        Txt3 = (ImageView) findViewById((R.id.Txt3));

        LinearLayoutManager llm = new LinearLayoutManager(this);
        RVitem.setLayoutManager(llm);
        RVitem.setHasFixedSize(true);
        getServiceData();
//        String check_status = "E";
//        if(check_status == "E") {
//           tl = (TimelineView) findViewById(R.id.time_marker);
////            tl.setBackgroundColor(Color.RED); หาวิธีเปลีeนสี
////            tl.setLineSize(100);
//        }


//      initializeData();
//      initializeAdapter();
    }



//    private void initializeData( ){
//        persons = new ArrayList<>();
//
////
//
////      Data_form_Dao = "joke";
//        persons.add(new Person("sadas", "ผู้ดำเนินการ : ","วันที่ดำเนินการ :"));
////        persons.add(new Person("คัวดำเนินการ : ", "ผู้ดำเนินการ : ","วันที่ดำเนินการ :"));
////        persons.add(new Person("คัวดำเนินการ : ", "ผู้ดำเนินการ : ","วันที่ดำเนินการ :"));
////        persons.add(new Person("คัวดำเนินการ : ", "ผู้ดำเนินการ : ","วันที่ดำเนินการ :"));
////        persons.add(new Person("คัวดำเนินการ : ", "ผู้ดำเนินการ : ","วันที่ดำเนินการ :"));
////        persons.add(new Person("คัวดำเนินการ : ", "ผู้ดำเนินการ : ","วันที่ดำเนินการ :"));
//    }
////
////    private void initializeAdapter(DataCollectionDao d){
////        RVAdapter adapter = new RVAdapter(d);
////        RVitem.setAdapter(adapter);
////    }
    private void getServiceData() {

        Call<DataCollectionDao> call = HttpManager.getInstance().getService().getDataList();
        call.enqueue(new Callback<DataCollectionDao>() {
            @Override
            public void onResponse(Call<DataCollectionDao> call, Response<DataCollectionDao> response) {
                if (response.isSuccessful()) {
                    DataCollectionDao data = response.body();
                    RVAdapter adapter = new RVAdapter(data);
                    RVitem.setAdapter(adapter);

                    Log.d("getServiceData", "if ::" + data.getData_flow().get(1).getName());
                } else {
                    Log.d("getServiceData", "else ::" + response.message());
                }
            }

            @Override
            public void onFailure(Call<DataCollectionDao> call, Throwable t) {
                Log.d("getServiceData", "error ::" + t);
            }
        });
    }
}
