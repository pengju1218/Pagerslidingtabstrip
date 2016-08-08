package com.example.ok;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadFactory;

import com.csdn.pagerslidingtabstrip.view.PagerSlidingTabStrip;
import com.csdn.pagerslidingtabstrip.view.listener.OnPageSelectListener;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class GetRecordActivity extends FragmentActivity {

    private ViewPager get_record_viewpager;
    private List<Fragment> fragmentList = new ArrayList<Fragment>();
    private GetRecordsPagerAdapter pagerAdapter;
    private PagerSlidingTabStrip get_record_tab;
    private MonthGetRecordFragment monthGetRecordFragment;
    private TotalGetRecordFragment totalGetRecordFragment;
    private DisplayMetrics dm; // 获取当前屏幕密度
    private final String[] titles = { "本月领", "本月领","本月领","本月领"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button  bt=(Button)findViewById(R.id.bit1);
        bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(GetRecordActivity.this,MainActivity.class);
				startActivity(intent);
			}
		});


        Button  bt2=(Button)findViewById(R.id.bit2);
        bt2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent=new Intent(GetRecordActivity.this,TwoActivity.class);
                startActivity(intent);
            }
        });

        Button  bt3=(Button)findViewById(R.id.bit3);
        bt3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent=new Intent(GetRecordActivity.this,ThreeActivity.class);
                startActivity(intent);
            }
        });

        initView();
    }

    private void initView() {

        get_record_viewpager = (ViewPager) this
                .findViewById(R.id.get_record_viewpager);
        get_record_tab = (PagerSlidingTabStrip) this
                .findViewById(R.id.get_record_tab);
        dm = getResources().getDisplayMetrics();
        monthGetRecordFragment = new MonthGetRecordFragment();
        totalGetRecordFragment = new TotalGetRecordFragment();
        fragmentList.add(monthGetRecordFragment);
        fragmentList.add(totalGetRecordFragment);
        pagerAdapter = new GetRecordsPagerAdapter(getSupportFragmentManager(),
                fragmentList);
        
        get_record_viewpager.setAdapter(pagerAdapter);
        
       // get_record_tab.setViewPager(get_record_viewpager);
        get_record_tab.setTitles(titles);
        get_record_tab.setSelectListener(new OnPageSelectListener() {
			
			@Override
			public void select(int i) {
				// TODO Auto-generated method stub
				Toast.makeText(GetRecordActivity.this, i+"", Toast.LENGTH_LONG).show();
			}
		});
        setTabsValue();
    }

    /**
     * 对PagerSlidingTabStrip的各项属性进行赋值。
     */
    private void setTabsValue() {
        // 设置Tab是自动填充满屏幕的
        get_record_tab.setShouldExpand(true);
        // 设置Tab的分割线是透明的
        get_record_tab.setDividerColor(Color.TRANSPARENT);
        // 设置Tab底部线的高度
        get_record_tab.setUnderlineHeight((int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 1, dm));
        // 设置Tab Indicator的高度
        get_record_tab.setIndicatorHeight((int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 2, dm));
        // 设置Tab标题文字的大小
        get_record_tab.setTextSize((int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_SP, 15, dm));
        // 设置Tab标题默认的颜色
        get_record_tab.setTextColor(getResources().getColor(
                R.color.get_record_text_unselected_color));
        // 设置选中Tab标题的颜色
        get_record_tab.setSelectedTextColor(getResources().getColor(
                R.color.get_record_text_selected_color));
        // 设置Tab底部线的颜色
        get_record_tab.setUnderlineColor(getResources().getColor(
                R.color.get_record_line_unselected_color));
        // 设置Tab Indicator的颜色
        get_record_tab.setIndicatorColor(getResources().getColor(
                R.color.get_record_line_selected_color));
        // 取消点击Tab时的背景色
        // get_record_tab.setTabBackground(getResources().getColor(R.color.tab_pressed_hover));
    }
}