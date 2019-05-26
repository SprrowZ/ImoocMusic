package com.imooc.music.zzg.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.imooc.music.zzg.BaseActivity;
import com.imooc.music.zzg.R;

public class ChangePasswordActivity extends BaseActivity {

    @Override
    protected int getLayoutRes() {
        return R.layout.activity_change_password;
    }

    @Override
    protected void initView() {
          initNav(true,"修改密码",false);
    }

    @Override
    protected void initEvent() {

    }


}
