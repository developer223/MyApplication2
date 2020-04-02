package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class ch4Actity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       //当界面创建时，自动回调，完成初始化的工作
        /*
        设置界面样式（布局文件），设置界面响应
         */

        super.onCreate(savedInstanceState);//调用父类的方法，不可省略
        setContentView(R.layout.activity_main);//设置界面样式
        int a=1;

        //输出日志,两个参数：tag,manage
        Log.i(ch4Actity.class.toString(),"concent");


    }
}
