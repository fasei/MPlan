package com.example.zhuyuanyuan.mplan;

import android.app.Application;

import cn.bmob.v3.Bmob;

/**
 * Created by zhuyuanyuan on 2018/1/29.
 */

public class MApp extends Application
{
    @Override
    public void onCreate() {
        super.onCreate();
        Bmob.initialize(this, BuildConfig.MBOB);

    }
}
