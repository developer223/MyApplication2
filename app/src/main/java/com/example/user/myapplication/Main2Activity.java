package com.example.user.myapplication;

import android.app.WallpaperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //加载页面,不要写文件名，使用资源编号
        setContentView(R.layout.layout_ch4_1);
        //1、获取普通页面组件
        Button button=(Button) findViewById(R.id.button1);
        ImageView imageView=(ImageView)findViewById(R.id.cha_iv);
        //3、调用事件源方法注册事件监听类
        button.setOnClickListener(new MyClickListener());
        //使用内部匿名类监听器
        imageView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
               //设置壁纸
                WallpaperManager wallpaperManager=(WallpaperManager) getSystemService(WALLPAPER_SERVICE);
              try{
                  wallpaperManager.setResource(R.raw.img);
              }catch(Exception e){
                  Log.e(Main2Activity.class.toString(),e.toString());
              }


                return true;
            }


        });
    }
    public void onFocusChange(View view,boolean b){
        //判断邮箱的合法性
        EditText editText=(EditText) view;
        if(!b){
            String content=editText.getText().toString();//得到edit的内容




        }
    }
    //2、实现事件监听类
    class MyClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Log.i(Main2Activity.class.toString(),"button click");
        }
    }


}
