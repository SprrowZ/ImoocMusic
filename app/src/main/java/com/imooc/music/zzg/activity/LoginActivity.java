package com.imooc.music.zzg.activity;

import android.content.Intent;
import android.view.View;

import com.imooc.music.zzg.BaseActivity;
import com.imooc.music.zzg.R;
import com.imooc.music.zzg.utils.UserUtils;
import com.imooc.music.zzg.views.InputView;


public class LoginActivity extends BaseActivity {
    private InputView inputPhone;
    private InputView inputPassword;

    @Override
    protected int getLayoutRes() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {
        initNav(false, "登陆", false);

        inputPhone = fd(R.id.input_phone);
        inputPassword = fd(R.id.input_password);
    }

    @Override
    protected void initEvent() {

    }

    public void onRegisterClick(View v) {
     Intent intent=new Intent(this, RegisterActivity.class);
     startActivity(intent);
    }

    public void onCommitClick(View view) {
        String phone = inputPhone.getInputStr();
        String password = inputPassword.getInputStr();
        if (UserUtils.validLogin(this, phone, password)) {
            return;
        }
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
