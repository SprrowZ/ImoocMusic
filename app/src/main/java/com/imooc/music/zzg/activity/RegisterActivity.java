package com.imooc.music.zzg.activity;

import android.content.Intent;
import android.view.View;

import com.imooc.music.zzg.BaseActivity;
import com.imooc.music.zzg.R;

public class RegisterActivity extends BaseActivity {

    @Override
    protected int getLayoutRes() {
        return R.layout.activity_register;
    }

    @Override
    protected void initView() {
       initNav(true,"注册",false);
    }

    @Override
    protected void initEvent() {

    }

    public void onRegiterClick(View view){
        Intent intent=new Intent();
    }

}
