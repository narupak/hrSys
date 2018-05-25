package com.example.lenovo.hr_team_7;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Lenovo on 2/5/2018.
 */

public interface ApiService {

    @POST("leaves/Service_Test_team7")
    Call<DataCollectionDao> getDataList();

}
