package com.example.lenovo.hr_team_7;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.Shape;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity1 extends AppCompatActivity {

    RecyclerView RVitem;
    CardView CVitem;
    ImageView Txt3;
    TextView TxtSick2;
    TextView TxtSick1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        RVitem = (RecyclerView)findViewById(R.id.RVitem);
//        CVitem = findViewById(R.id.CVitem);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        RVitem.setLayoutManager(llm);
        RVitem.setHasFixedSize(true);

       getServiceData();
    }

    private void getServiceData() {
        Call<DataCollectionDao> call = HttpManager.getInstance().getService().getDataList();
        call.enqueue(new Callback<DataCollectionDao>() {
            @Override
            public void onResponse(Call<DataCollectionDao> call, Response<DataCollectionDao> response) {
                if (response.isSuccessful()) {
                    DataCollectionDao data = response.body();

                    AdapterService dataAdapter = new AdapterService(data,MainActivity1.this);
                    RVitem.setAdapter(dataAdapter);


                   Log.d("getServiceData", "Result ::" + data.getData().get(1).getLhis_id());
                } else {
                    Log.d("getServiceData", "Result ::" + response.message());
                }
            }

            @Override
            public void onFailure(Call<DataCollectionDao> call, Throwable t) {
                Log.d("getServiceData", "error ::" + t);
            }
        });
    }


}
