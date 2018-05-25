package com.example.lenovo.hr_team_7;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class DataCollectionDao_pa {

    @SerializedName("attention_person")
    private List<DataDao> attention_person;

    @SerializedName("profile")
    private List<DataDao> profile;

    @SerializedName("date_attention")
    private List<DataDao> date_attention;

    @SerializedName("count_attention_person")
    private List<DataDao> count_attention_person;

    @SerializedName("count_NOT_attention_person")
    private List<DataDao> count_NOT_attention_person;

    public List<DataDao> getAttention_person() {
        return attention_person;
    }

    public void setAttention_person(List<DataDao> attention_person) {
        this.attention_person = attention_person;
    }

    public List<DataDao> getDate_attention() {
        return date_attention;
    }

    public void setDate_attention(List<DataDao> date_attention) {
        this.date_attention = date_attention;
    }

    public List<DataDao> getCount_attention_person() {
        return count_attention_person;
    }

    public void setCount_attention_person(List<DataDao> count_attention_person) {
        this.count_attention_person = count_attention_person;
    }

    public List<DataDao> getCount_NOT_attention_person() {
        return count_NOT_attention_person;
    }

    public void setCount_NOT_attention_person(List<DataDao> count_NOT_attention_person) {
        this.count_NOT_attention_person = count_NOT_attention_person;
    }

    public List<DataDao> getProfile() {
        return profile;
    }

    public void setProfile(List<DataDao> profile) {
        this.profile = profile;
    }
}
