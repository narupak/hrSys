package com.example.lenovo.hr_team_7;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Narupak on 4/5/2561.
 */

public class ApproveList {


    @SerializedName("rs_hl")
    private List<ApproveList> rs_hl;

    @SerializedName("rs_dev")
    private List<ApproveList> rs_dev;

    @SerializedName("rs_lc")
    private List<ApproveList> rs_lc;

    @SerializedName("rs_appDir")
    private List<ApproveList> rs_appDir;

    @SerializedName("ps_fname")
    private String ps_fname;

    @SerializedName("ps_lname")
    private String ps_lname;

    @SerializedName("leave_name")
    private String leave_name;

    @SerializedName("pf_name")
    private String pf_name;

    @SerializedName("lhis_num_day")
    private String lhis_num_day;

    @SerializedName("lhis_start_date")
    private String lhis_start_date;

    @SerializedName("lhis_end_date")
    private String lhis_end_date;

    @SerializedName("lhis_write_date")
    private String lhis_write_date;

    @SerializedName("lhis_write_place")
    private String lhis_write_place;

    @SerializedName("dept_name")
    private String dept_name;

    @SerializedName("lhis_topic")
    private String lhis_topic;

    @SerializedName("lhis_tell")
    private String lhis_tell;

    @SerializedName("lhis_conscription")
    private String lhis_conscription;

    @SerializedName("lhis_place_name")
    private String lhis_place_name;

    @SerializedName("lhis_place_name_2")
    private String lhis_place_name_2;

    @SerializedName("lhis_status")
    private String lhis_status;

    @SerializedName("lhis_ps_id")
    private String ps_id_leave;

    @SerializedName("lhis_id")
    private String billId;


    @SerializedName("psIdapv")
    private String psIdapv;



    public String getPs_fname() {
        return ps_fname;
    }

    public void setPs_fname(String ps_fname) {
        this.ps_fname = ps_fname;
    }

    public String getPs_lname() {
        return ps_lname;
    }

    public void setPs_lname(String ps_lname) {
        this.ps_lname = ps_lname;
    }

    public String getLeave_name() {
        return leave_name;
    }

    public void setLeave_name(String leave_name) {
        this.leave_name = leave_name;
    }

    public String getPf_name() {
        return pf_name;
    }

    public void setPf_name(String pf_name) {
        this.pf_name = pf_name;
    }

    public List<ApproveList> getRs_dev() {
        return rs_dev;
    }

    public void setRs_dev(List<ApproveList> rs_dev) {
        this.rs_dev = rs_dev;
    }

    public List<ApproveList> getRs_hl() {
        return rs_hl;
    }

    public void setRs_hl(List<ApproveList> rs_hl) {
        this.rs_hl = rs_hl;
    }

    public List<ApproveList> getRs_lc() {
        return rs_lc;
    }

    public void setRs_lc(List<ApproveList> rs_lc) {
        this.rs_lc = rs_lc;
    }

    public List<ApproveList> getRs_appDir() {
        return rs_appDir;
    }

    public void setRs_appDir(List<ApproveList> rs_appDir) {
        this.rs_appDir = rs_appDir;
    }

    public String getLhis_num_day() {
        return lhis_num_day;
    }

    public void setLhis_num_day(String lhis_num_day) {
        this.lhis_num_day = lhis_num_day;
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


    public String getLhis_write_date() {
        return lhis_write_date;
    }

    public void setLhis_write_date(String lhis_write_date) {
        this.lhis_write_date = lhis_write_date;
    }

    public String getLhis_write_place() {
        return lhis_write_place;
    }

    public void setLhis_write_place(String lhis_write_place) {
        this.lhis_write_place = lhis_write_place;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getLhis_topic() {
        return lhis_topic;
    }

    public void setLhis_topic(String lhis_topic) {
        this.lhis_topic = lhis_topic;
    }

    public String getLhis_tell() {
        return lhis_tell;
    }

    public void setLhis_tell(String lhis_tell) {
        this.lhis_tell = lhis_tell;
    }

    public String getLhis_conscription() {
        return lhis_conscription;
    }

    public void setLhis_conscription(String lhis_conscription) {
        this.lhis_conscription = lhis_conscription;
    }

    public String getLhis_place_name_2() {
        return lhis_place_name_2;
    }

    public void setLhis_place_name_2(String lhis_place_name_2) {
        this.lhis_place_name_2 = lhis_place_name_2;
    }

    public String getLhis_place_name() {
        return lhis_place_name;
    }

    public void setLhis_place_name(String lhis_place_name) {
        this.lhis_place_name = lhis_place_name;
    }

    public String getLhis_status() {
        return lhis_status;
    }

    public void setLhis_status(String lhis_status) {
        this.lhis_status = lhis_status;
    }


    public String getPs_id_leave() {
        return ps_id_leave;
    }

    public void setPs_id_leave(String ps_id_leave) {
        this.ps_id_leave = ps_id_leave;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getPsIdapv() {
        return psIdapv;
    }

    public void setPsIdapv(String psIdapv) {
        this.psIdapv = psIdapv;
    }
}