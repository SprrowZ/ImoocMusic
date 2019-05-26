package com.imooc.music.zzg.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.text.InputType;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.imooc.music.zzg.R;

/**
 * Created by 18041at 2019/5/18
 * Function:
 * 1.input_icon：输入框前面的图标
 * 2.input_hint:输入框的提示内容
 * 3.is_password:输入是否是密码
 */
public class InputView extends FrameLayout {
    private int inputIcon;
    private String inputHint;
    private boolean isPassword;

    private View mView;
    private ImageView mIvIcon;
    private EditText mEtInput;
    public InputView(@Nullable Context context) {
        super(context,null);
        init(context,null);
    }

    public InputView(@Nullable Context context, @Nullable AttributeSet attrs) {
        super(context, attrs,0);
        init(context,attrs);
    }

    public InputView(@Nullable Context context,@Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context,attrs);
    }
    private void init(Context context,AttributeSet attrs){
        if (attrs==null) return ;
        TypedArray typedArray=context.obtainStyledAttributes(attrs,R.styleable.inputView);
        inputIcon=typedArray.getResourceId(R.styleable.inputView_input_icon,R.mipmap.logo);
        inputHint=typedArray.getString(R.styleable.inputView_input_hint);
        isPassword=typedArray.getBoolean(R.styleable.inputView_is_password,false);
        typedArray.recycle();

        mView=LayoutInflater.from(context).inflate(R.layout.input_view,null,false);
        mIvIcon=mView.findViewById(R.id.iv_icon);
        mEtInput=mView.findViewById(R.id.edit);

        mIvIcon.setImageResource(inputIcon);
        mEtInput.setHint(inputHint);
        mEtInput.setInputType(isPassword?InputType.TYPE_CLASS_TEXT|InputType.TYPE_NUMBER_VARIATION_PASSWORD:InputType.TYPE_CLASS_NUMBER);
        addView(mView);


    }
    /*
    * 返回输入的内容
     */
    public String getInputStr(){
        return mEtInput.getText().toString().trim();
    }
}
