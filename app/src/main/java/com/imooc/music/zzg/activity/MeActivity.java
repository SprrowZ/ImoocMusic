package com.imooc.music.zzg.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.imooc.music.zzg.BaseActivity;
import com.imooc.music.zzg.R;
import com.imooc.music.zzg.utils.UserUtils;

public class MeActivity extends BaseActivity {

    @Override
    protected int getLayoutRes() {
        return R.layout.activity_me;
    }

    @Override
    protected void initView() {
     initNav(true,"个人中心",false);
    }

    @Override
    protected void initEvent() {

    }

    public void onChangeClick(View view){
        Intent intent=new Intent(this,ChangePasswordActivity.class);
        startActivity(intent);
    }
    public void onLogoutClick(View view){
        UserUtils.logout(this);
    }

}
