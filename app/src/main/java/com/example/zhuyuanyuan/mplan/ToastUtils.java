package com.example.zhuyuanyuan.mplan;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by zhuyuanyuan on 2018/1/29.
 */

public class ToastUtils {
    public static void showMsg(Context mContext,String msg){
        Toast.makeText(mContext,msg,Toast.LENGTH_LONG).show();
    }

}
