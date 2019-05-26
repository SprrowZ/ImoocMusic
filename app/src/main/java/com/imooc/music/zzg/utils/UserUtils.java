package com.imooc.music.zzg.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.Toast;

import com.imooc.music.zzg.R;
import com.imooc.music.zzg.activity.LoginActivity;

/**
 * Created by 18041at 2019/5/25
 * Function:
 */
public class UserUtils {
    /**
     * 验证用户登录合法性
     * @param context
     * @param phone
     * @param password
     * @return
     */
    public static boolean validLogin(Context context,String phone,String password){
        if (!RegexUtils.isMobileExact(phone)){
            Toast.makeText(context,"无效手机号！",Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(password)){
            Toast.makeText(context,"请输入密码！",Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
    public static void logout(Context context){
        Intent intent=new Intent(context,LoginActivity.class);
        //intent标志位
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
        //style里的动画作用于栈，而上面flag里清空了栈，会导致动画没有
        ((Activity)context).overridePendingTransition(R.anim.open_enter,R.anim.close_exit);
    }
}
