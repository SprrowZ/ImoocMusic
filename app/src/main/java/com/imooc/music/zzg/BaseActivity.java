package com.imooc.music.zzg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.imooc.music.zzg.activity.MeActivity;

/**
 * Created by 18041at 2019/5/17
 * Function:
 */
public abstract class BaseActivity extends AppCompatActivity {
    private TextView tvTitle;
    private ImageView ivBack,ivMe;


    protected abstract  int getLayoutRes();
    protected  abstract  void initView();
    protected  abstract  void initEvent();
    //泛型
    protected  <T extends View> T fd(@IdRes int id){
        return findViewById(id);
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 去掉标题栏
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        //去掉状态栏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        if (getLayoutRes()!=0){
           setContentView(getLayoutRes());
        }
        initView();
        initEvent();
    }

    protected  void  initNav(boolean isShowback,String title,boolean isShowme){
         ivBack=fd(R.id.iv_back);
         ivMe=fd(R.id.iv_me);
         tvTitle=fd(R.id.tv_title);
         tvTitle.setText(title);
         if (!isShowback){
             ivBack.setVisibility(View.GONE);
         }
         if (!isShowme){
             ivMe.setVisibility(View.GONE);
         }
         ivBack.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 onBackPressed();
             }
         });

         ivMe.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
              startActivity(new Intent(BaseActivity.this,MeActivity.class));
             }
         });
    }

}
