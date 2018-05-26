package com.example.lenovo.hr_team_7;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Lenovo on 2/5/2018.
 */

public interface ApiService {

    @POST("leaves/Service_Test_team7")
    Call<DataCollectionDao> getDataList();

    @POST("leaves/Service_Test_team7/service_approveList")
    Call<ApproveList> getApproveListDataList();



    @POST("leaves/Service_Test_team7/approveSave")
    Call <ResponseBody> savePost(@Body String requestBody);



}
