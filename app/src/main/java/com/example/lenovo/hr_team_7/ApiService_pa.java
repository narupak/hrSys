package com.example.lenovo.hr_team_7;

import retrofit2.Call;
import retrofit2.http.POST;


public interface ApiService_pa {

    @POST("leaves/Service_Test_team7/Flow")
    Call<DataCollectionDao_pa> getDataList_pa();

}
