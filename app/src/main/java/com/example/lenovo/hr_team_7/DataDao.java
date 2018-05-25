package com.example.lenovo.hr_team_7;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Lenovo on 25/4/2018.
 */

public class DataDao {
    @SerializedName("leave_name")
    private String leaveName;

    @SerializedName("lhis_start_date")
    private String lhis_start_date;

    @SerializedName("lhis_end_date")
    private String lhis_end_date;

    @SerializedName("lhis_status")
    private String lhis_status;

    @SerializedName("lhis_status_name")
    private String lhis_status_name;

    @SerializedName("lhis_id")
    private String lhis_id;

    @SerializedName("lhis_leave_id")
    private String lhis_leave_id;

    public String getLeaveName() {
        return leaveName;
    }

    public void setLeaveName(String leaveName) {
        this.leaveName = leaveName;
    }

    public String getLhis_start_date() {
        return lhis_start_date;
    }

    public void setLhis_start_date(String lhis_start_date) {
        this.lhis_start_date = lhis_start_date;
    }

    public String getLhis_end_date() {
        return lhis_end_date;
    }

    public void setLhis_end_date(String lhis_end_date) {
        this.lhis_end_date = lhis_end_date;
    }

    public String getLhis_status() {
        return lhis_status;
    }

    public void setLhis_status(String lhis_status) {
        this.lhis_status = lhis_status;
    }

    public String getLhis_status_name() {
        return lhis_status_name;
    }

    public void setLhis_status_name(String lhis_status_name) {
        this.lhis_status_name = lhis_status_name;
    }

    public String getLhis_id() {
        return lhis_id;
    }

    public void setLhis_id(String lhis_id) {
        this.lhis_id = lhis_id;
    }

    public String getLhis_leave_id() {
        return lhis_leave_id;
    }

    public void setLhis_leave_id(String lhis_leave_id) {
        this.lhis_leave_id = lhis_leave_id;
    }


















}
