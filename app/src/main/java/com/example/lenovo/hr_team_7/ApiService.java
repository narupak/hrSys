package com.example.lenovo.hr_team_7;


import com.example.lenovo.hr_team_7.ApproveList;

import java.util.List;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ApiService {

    @POST("leaves/Service_Test_team7")
    Call<DataCollectionDao> getDataList();

    @POST("leaves/Service_Test_team7/service_approveList")
    Call<ApproveList> getApproveListDataList();


    @POST("leaves/Service_Test_team7/approveSave")
    Call <ResponseBody> savePost(@Body String requestBody);


}
