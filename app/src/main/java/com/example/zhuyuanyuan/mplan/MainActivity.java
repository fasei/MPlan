package com.example.zhuyuanyuan.mplan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import com.example.zhuyuanyuan.mplan.base.BaseActivity;
import com.example.zhuyuanyuan.mplan.bean.UserInfo;

import butterknife.BindView;
import butterknife.OnClick;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

public class MainActivity extends BaseActivity {

    @BindView(R.id.inputUserName)
    EditText inputUserName;
    @BindView(R.id.inputUserPwd)
    EditText inputUserPwd;
    @BindView(R.id.login)
    TextView login;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @OnClick(R.id.login)
    public void onViewClicked() {
        UserInfo mUserInfo=new UserInfo();
        mUserInfo.setUsername("15128296802");
        mUserInfo.setPassword("919536816");

        mUserInfo.signUp(new SaveListener<UserInfo>() {
            @Override
            public void done(UserInfo userInfo, BmobException e) {
                if(e==null){
                    ToastUtils.showMsg(MainActivity.this,"success");
                }else{
                    ToastUtils.showMsg(MainActivity.this,"success");
                }
            }
        });


    }
}
