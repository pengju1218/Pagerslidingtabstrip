package com.example.ok;

import android.app.Activity;
import android.os.Bundle;

import com.csdn.pagerslidingtabstrip.view.SlidingTab;
import com.example.ok.R;
import com.flyco.tablayout.SegmentTabLayout;


/**
 * Created by Administrator on 2016/8/7.
 */
public class ThreeActivity extends Activity {


    private String[] mTitles = {"首页", "消息"};
    private String[] mTitles_2 = {"首页", "消息", "联系人"};
    private String[] mTitles_3 = {"首页", "消息", "联系人", "更多"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        SegmentTabLayout tabLayout_1 = (SegmentTabLayout)findViewById(R.id.tl_1) ;
        SegmentTabLayout tabLayout_2 = (SegmentTabLayout)findViewById(R.id.tl_2) ;
        SegmentTabLayout tabLayout_3 = (SegmentTabLayout)findViewById(R.id.tl_3) ;
        SegmentTabLayout tabLayout_4 = (SegmentTabLayout)findViewById(R.id.tl_4) ;
        SegmentTabLayout tabLayout_5 = (SegmentTabLayout)findViewById(R.id.tl_5) ;
        tabLayout_1.setTabData(mTitles_2);
        tabLayout_2.setTabData(mTitles_2);
        tabLayout_3.setTabData(mTitles_2);
        tabLayout_4.setTabData(mTitles_2);
        tabLayout_5.setTabData(mTitles_2);
    }

}

