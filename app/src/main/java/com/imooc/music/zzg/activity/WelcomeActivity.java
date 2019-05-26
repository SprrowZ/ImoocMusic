package com.imooc.music.zzg.activity;

import android.content.Intent;

import com.imooc.music.zzg.BaseActivity;
import com.imooc.music.zzg.R;

import java.util.Timer;
import java.util.TimerTask;

public class WelcomeActivity extends BaseActivity {
    private Timer mTimer;
    @Override
    protected int getLayoutRes() {
        return R.layout.activity_welcome;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initEvent() {
         mTimer=new Timer();
         mTimer.schedule(new TimerTask() {
             @Override
             public void run() {
               toLogin();
             }
         },3000);
    }
    private void toMain(){
        Intent intent =new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    private void toLogin(){
        Intent intent=new Intent(this,LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
