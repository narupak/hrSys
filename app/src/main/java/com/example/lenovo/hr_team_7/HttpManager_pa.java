package com.example.lenovo.hr_team_7;

import android.content.Context;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HttpManager_pa {
    private static HttpManager_pa instance;

    public static HttpManager_pa getInstance() {
        if (instance == null)
            instance = new HttpManager_pa();
        return instance;
    }

    private Context mContext;
    private ApiService_pa service;

    private HttpManager_pa() {
        mContext = Contextor.getInstance().getContext();
        OkHttpClient okHttpClient = UnsafeOkHttpClient.getUnsafeOkHttpClient();
        //.client(okHttpClient)
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://10.80.39.23/pcksite/index.php/hr/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
        service = retrofit.create(ApiService_pa.class);
    }
    public  ApiService_pa getService_pa(){
        return  service;
    }
}
