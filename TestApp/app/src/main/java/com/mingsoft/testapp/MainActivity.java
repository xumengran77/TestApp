package com.mingsoft.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Bean> mIconBeenList;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView) findViewById(R.id.lv);
        mIconBeenList=new ArrayList<>();
        initDate();
        listView.setAdapter(new MyAdapter(this,mIconBeenList));
    }

    public void initDate(){
        Bean bean=new Bean("这是个说明", R.mipmap.pic1);
        Bean bean1=new Bean("这是个说明", R.mipmap.pic2);
        Bean bean2=new Bean("这是个说明", R.mipmap.pic3);
        Bean bean3=new Bean("这是个说明", R.mipmap.pic4);
        mIconBeenList.add(bean);
        mIconBeenList.add(bean1);
        mIconBeenList.add(bean2);
        mIconBeenList.add(bean3);

    }

}
