package com.example.zhuyuanyuan.mplan.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.zhuyuanyuan.mplan.R;

import butterknife.ButterKnife;

/**
 * Created by zhuyuanyuan on 2018/1/29.
 */

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
