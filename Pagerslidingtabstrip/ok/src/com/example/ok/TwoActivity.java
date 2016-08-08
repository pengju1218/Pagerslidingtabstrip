package com.example.ok;

import android.app.Activity;
import android.os.Bundle;

import com.csdn.pagerslidingtabstrip.view.SlidingTab;


/**
 * Created by Administrator on 2016/8/7.
 */
public class TwoActivity extends Activity {


    public String[] s = {"资金", "商品", "类型", "币种", "资金", "商品", "资金", "商品", "类型",
            "币种", "资金", "商品", "资金", "商品", "类型", "币种", "资金", "商品"};
    private SlidingTab slidingTab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        slidingTab = (SlidingTab) findViewById(R.id.slidingtab);
        slidingTab.setTitles(s);
        slidingTab.requestDisallowInterceptTouchEvent(true);

    }

}

