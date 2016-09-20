package com.example.dllo.testdemo;

import android.widget.TextView;

public class MainActivity extends BaseAty {

    @Override
    protected int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        TextView tv = bindView(R.id.main_tv);
    }

    @Override
    protected void initData() {

    }
}
