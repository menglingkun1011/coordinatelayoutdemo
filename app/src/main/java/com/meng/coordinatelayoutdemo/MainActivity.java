package com.meng.coordinatelayoutdemo;

import android.graphics.Color;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    private Toolbar toobar;
    private CollapsingToolbarLayout collapsingtoolbarlayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toobar = (Toolbar) findViewById(R.id.toolbar);
        collapsingtoolbarlayout = (CollapsingToolbarLayout) findViewById(R.id.collapsingtoolbarlayout);
//        toobar.setTitle("我是乾坤");
//        toobar.setSubtitle("我是子标题");
//        toobar.setLogo(R.mipmap.ic_launcher);
        setSupportActionBar(toobar);
        collapsingtoolbarlayout.setTitle("我是乾坤");
        collapsingtoolbarlayout.setCollapsedTitleTextColor(Color.WHITE);
        collapsingtoolbarlayout.setExpandedTitleColor(Color.WHITE);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
