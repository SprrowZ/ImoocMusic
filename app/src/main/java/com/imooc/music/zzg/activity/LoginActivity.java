package com.imooc.music.zzg.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.imooc.music.zzg.BaseActivity;
import com.imooc.music.zzg.R;

public class LoginActivity extends BaseActivity {

    @Override
    protected int getLayoutRes() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {
        initNav(false,"登陆",false);
    }

    @Override
    protected void initEvent() {

    }


}
