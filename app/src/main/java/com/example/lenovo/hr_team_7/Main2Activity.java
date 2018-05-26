package com.example.lenovo.hr_team_7;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import retrofit2.http.POST;

public class Main2Activity extends AppCompatActivity implements Callback<ResponseBody> {

    TextView address_write;
    TextView name;
    TextView position;
    TextView topic;
    TextView call;
    TextView postscript;
    TextView leavedate;
    TextView numday;
    TextView address;
    private static String ps_id_leave;
    private static String alSeq;
    private static  String billId;
    private static String billType;
    private static String psIdapv;
    private static String yesB;
    private static String noB;
    int index;
    Dialog mydialog;
    private CheckedTextView mResponseTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        address_write = (TextView) findViewById(R.id.address_write);
        name = (TextView) findViewById(R.id.txtname);
        position = (TextView) findViewById(R.id.position);
        topic = (TextView) findViewById(R.id.topic);
        call = (TextView) findViewById(R.id.call);
        postscript = (TextView) findViewById(R.id.postscript);
        leavedate = (TextView) findViewById(R.id.leavedate);
        numday = (TextView) findViewById(R.id.numday);
        address = (TextView) findViewById(R.id.address);



        Bundle bundle = getIntent().getExtras();
        String address_writes = bundle.getString("address_write");
        String names = bundle.getString("name");
        String positions = bundle.getString("position");
        String topics = bundle.getString("topic");
        String calls = bundle.getString("call");
        String postscripts = bundle.getString("postscript");
        String leavedates = bundle.getString("leavedate");
        String numdays = bundle.getString("numday");
        String addresss = bundle.getString("address");
        String ps_id_leaves = bundle.getString("ps_id_leave");
        String alSeqs = bundle.getString("alSeq");
        String billIds = bundle.getString("billId");
        String billTypes = bundle.getString("billType");
        String psIdapvs = bundle.getString("psIdapv");
        String yesBs = bundle.getString("yesB");
        String noBs = bundle.getString("noB");
        final int index = bundle.getInt("index");

        address_write.setText(address_writes);
        name.setText(names);
        position.setText(positions);
        topic.setText(topics);
        call.setText(calls);
        postscript.setText(postscripts);
        leavedate.setText(leavedates);
        numday.setText(numdays);
        address.setText(addresss);

        ps_id_leave = ps_id_leaves;
        alSeq = alSeqs;
        billId = billIds;
        billType = billTypes;
        psIdapv = psIdapvs;
        yesB = yesBs;
        noB = noBs;

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.accept :
                getAccept(ps_id_leave,alSeq,billId,billType,psIdapv,yesB);
                break;
            case R.id.noaccept :
                getnoAccept(ps_id_leave,alSeq,billId,billType,psIdapv,noB);
                break;
            case R.id.edit :
                getedit(ps_id_leave,alSeq,billId,billType,psIdapv);
                break;
            case R.id.check_status :
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    private void getedit(final String ps_id_leave, final String alSeq, final String billId, final String billType, final String psIdapv){
        Log.d("edit", "if ::" + "edit");
        final Dialog dialog = new Dialog(Main2Activity.this);
        dialog.setTitle("Devahoy");
        dialog.setContentView(R.layout.dialog_edit);
        final EditText edittext = (EditText) dialog.findViewById(R.id.edit_txt_leave);
        Button button = (Button) dialog.findViewById(R.id.btnaccept);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                OkHttpClient okHttpClient = UnsafeOkHttpClient.getUnsafeOkHttpClient();
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("https://10.80.39.23/pcksite/index.php/hr/")
                        .client(okHttpClient)
                        .addConverterFactory(ScalarsConverterFactory.create())
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
                ApiService apiService = retrofit.create(ApiService.class);
                try {
                    JSONObject paramObject = new JSONObject();
                    paramObject.put("ps_id_leave" , ps_id_leave);
                    paramObject.put("psIdapv", psIdapv);
                    paramObject.put("alOpinion",edittext.getText().toString());
                    paramObject.put("alSeq", alSeq);
                    paramObject.put("billId", billId);
                    paramObject.put("billType", billType);

                    Call<ResponseBody> responseBody = apiService.savePost(paramObject.toString());
                    Log.d("getServiceData", "if ::" + paramObject);
                    responseBody.enqueue(new Callback<ResponseBody>() {
                        @Override
                        public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                            ResponseBody responsebody = response.body();
                            try{
                                Log.d("getServiceData", "if ::" + responsebody.string());
                                Intent refresh = new Intent(Main2Activity.this, MainActivity.class);
                                startActivity(refresh);
                                finish();
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }

                        @Override
                        public void onFailure(Call<ResponseBody> call, Throwable t) {

                        }
                    });
                }catch (JSONException e){
                    e.printStackTrace();
                }
            }
        });
        dialog.show();
    }
    public void getAccept(String ps_id_leave, String alSeq, String billId, String billType, String psIdapv, String yesB) {
        OkHttpClient okHttpClient = UnsafeOkHttpClient.getUnsafeOkHttpClient();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://10.80.39.23/pcksite/index.php/hr/")
                .client(okHttpClient)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiService apiService = retrofit.create(ApiService.class);
        try {
            JSONObject paramObject = new JSONObject();
            paramObject.put("ps_id_leave" , ps_id_leave);
            paramObject.put("psIdapv",psIdapv);
            paramObject.put("yesB","Y");
            paramObject.put("alSeq",alSeq);
            paramObject.put("billId",billId);
            paramObject.put("billType",billType);

            Call<ResponseBody> responseBody = apiService.savePost(paramObject.toString());
            Log.d("getServiceData", "if ::" + paramObject);
            responseBody.enqueue(this);
            Intent refresh = new Intent(Main2Activity.this, MainActivity.class);
            startActivity(refresh);
            finish();
        }catch (JSONException e){
            e.printStackTrace();
        }
    }

    public void getnoAccept(String ps_id_leave, String alSeq, String billId, String billType, String psIdapv, String yesB) {
        OkHttpClient okHttpClient = UnsafeOkHttpClient.getUnsafeOkHttpClient();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://10.80.39.23/pcksite/index.php/hr/")
                .client(okHttpClient)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiService apiService = retrofit.create(ApiService.class);
        try {
            JSONObject paramObject = new JSONObject();
            paramObject.put("ps_id_leave" , ps_id_leave);
            paramObject.put("psIdapv",psIdapv);
            paramObject.put("noB","N");
            paramObject.put("alSeq",alSeq);
            paramObject.put("billId",billId);
            paramObject.put("billType",billType);

            Call<ResponseBody> responseBody = apiService.savePost(paramObject.toString());
            Log.d("getServiceData", "if ::" + paramObject);
            responseBody.enqueue(this);
        }catch (JSONException e){
            e.printStackTrace();
        }
    }


    @Override
    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
        ResponseBody responsebody = response.body();
        System.out.println(responsebody.toString());

        Log.d("getServiceData", "if ::" + response.message());
        try{
            Log.d("getServiceData", "if ::" + responsebody.string());
            Intent refresh = new Intent(Main2Activity.this, MainActivity.class);
            startActivity(refresh);
            finish();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void onFailure(Call<ResponseBody> call, Throwable t) {

    }
}
