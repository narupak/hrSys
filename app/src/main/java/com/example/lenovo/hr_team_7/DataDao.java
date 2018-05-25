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

    /////////////////////////////////////////////////// dataFlow

    @SerializedName("apfp_seq")
    private String apfp_seq;
    public String getApfp_seq() { return apfp_seq; }
    public void setApfp_seq(String apfp_seq) { this.apfp_seq = apfp_seq; }

    @SerializedName("apfp_status_name")
    private String apfp_status_name;
    public String getApfp_status_name() { return apfp_status_name; }
    public void setApfp_status_name(String apfp_status_name) { this.apfp_status_name = apfp_status_name; }

    @SerializedName("apfp_bill_id")
    private String apfp_bill_id;
    public String getApfp_bill_id() { return apfp_bill_id; }
    public void setApfp_bill_id(String apfp_bill_id) { this.apfp_bill_id = apfp_bill_id; }


    @SerializedName("apfp_apdept_name")
    private String apfp_apdept_name;
    public String getApfp_apdept_name() { return apfp_apdept_name; }
    public void setApfp_apdept_name(String apfp_apdept_name) { this.apfp_apdept_name = apfp_apdept_name; }

    @SerializedName("Name")
    private String Name;
    public String getName() { return Name; }
    public void setName(String name) { Name = name; }

        ////////// pa ///////////
        @SerializedName("tio_ps_id")
        private String tio_id;

        @SerializedName("NAME")
        private String NAME;

        public String getTio_id() {
            return tio_id;
        }

        public void setTio_id(String tio_id) {
            this.tio_id = tio_id;
        }

        public String getNAME() {
            return NAME;
        }

        public void setNAME(String NAME) {
            this.NAME = NAME;
        }
    @SerializedName("hire_name")
    private String hire_name;

        public String getHire_name() {
            return hire_name;
        }

        public void setHire_name(String hire_name) {
            this.hire_name = hire_name;
        }

    @SerializedName("time_start")
    private String time_start;

    @SerializedName("time_end")
    private String time_end;

    @SerializedName("time_now")
    private String time_now;

    @SerializedName("sum_no_att")
    private String sum_no_att;


    public String getTime_start() {
        return time_start;
    }

    public void setTime_start(String time_start) {
        this.time_start = time_start;
    }

    public String getTime_end() {
        return time_end;
    }

    public void setTime_end(String time_end) {
        this.time_end = time_end;
    }

    public String getTime_now() {
        return time_now;
    }

    public void setTime_now(String time_now) {
        this.time_now = time_now;
    }

    public String getSum_no_att() {
        return sum_no_att;
    }










    public void setSum_no_att(String sum_no_att) {
        this.sum_no_att = sum_no_att;
    }
}
















