package com.imooc.music.zzg.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.imooc.music.zzg.BaseActivity;
import com.imooc.music.zzg.R;

public class MainActivity extends BaseActivity {

    @Override
    protected int getLayoutRes() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
      initNav(false,"慕课音乐",true);
    }

    @Override
    protected void initEvent() {

    }


}
