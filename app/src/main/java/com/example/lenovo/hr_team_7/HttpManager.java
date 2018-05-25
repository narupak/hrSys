package com.example.lenovo.hr_team_7;

import android.content.Context;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HttpManager {
    private static HttpManager instance;

    public static HttpManager getInstance() {
        if (instance == null)
            instance = new HttpManager();
        return instance;
    }

    private Context mContext;
    private ApiService service;

    private HttpManager() {
        mContext = com.example.lenovo.hr_team_7.Contextor.getInstance().getContext();
        OkHttpClient okHttpClient = com.example.lenovo.hr_team_7.UnsafeOkHttpClient.getUnsafeOkHttpClient();
        //
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://10.80.39.23/pcksite/index.php/hr/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
        service = retrofit.create(ApiService.class);
    }
    public ApiService getService(){
        return  service;
    }
}
