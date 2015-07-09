package com.xinlan.ptrtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import in.srain.cube.views.ptr.PtrDefaultHandler;
import in.srain.cube.views.ptr.PtrFrameLayout;


public class MainActivity extends ActionBarActivity {
    private PtrFrameLayout mPullRefresh;
    private View imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPullRefresh = (PtrFrameLayout) findViewById(R.id.pull_to_refresh);

        //mPullRefresh.setPullToRefresh(true);

        mPullRefresh.setPtrHandler(new PtrDefaultHandler() {
            @Override
            public void onRefreshBegin(PtrFrameLayout frame) {
                mPullRefresh.refreshComplete();
            }
        });
        //mPullRefresh.setPullToRefresh(false);

//        mPullRefresh.setPtrHandler(new PtrHandler() {
//            @Override
//            public void onRefreshBegin(PtrFrameLayout frame) {
//            }
//
//            @Override
//            public boolean checkCanDoRefresh(PtrFrameLayout frame, View content, View header) {
//                return PtrDefaultHandler.checkContentCanBePulledDown(frame, content, header);
//            }
//        });
//        this.mPullRefresh.autoRefresh();
        imgView = findViewById(R.id.img);
        imgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent();
                it.setClass(MainActivity.this
                        , PullActivity.class);
                MainActivity.this.startActivity(it);
            }
        });
    }
}//end class
