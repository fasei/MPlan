package com.example.zhuyuanyuan.mplan.bean;

import cn.bmob.v3.BmobUser;

/**
 * 用户信息表
 * Created by wangchao on 2018/1/29.
 */
public class UserInfo extends BmobUser{

    private String address;//住址
    private String picUrl;//头像地址

    private Integer sex;//性别
    private String nickName;//昵称
    private String state;//个人状态描述

    public UserInfo() {
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }


}
