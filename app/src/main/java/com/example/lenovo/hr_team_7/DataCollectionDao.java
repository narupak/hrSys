package com.example.lenovo.hr_team_7;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Lenovo on 2/5/2018.
 */

public class DataCollectionDao {

    @SerializedName("data")
    private List<DataDao> data;

    public List<DataDao> getData() {
        return data;
    }

    public void setData(List<DataDao> data) {
        this.data = data;
    }

}
