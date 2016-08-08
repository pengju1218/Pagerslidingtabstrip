package com.example.ok;

import java.util.List;

import com.csdn.pagerslidingtabstrip.view.PagerSlidingTabStrip.IconTabProvider;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * 类说明：
 * 
 * @author fuyanan
 * @date 2015-8-3
 * @version 1.0.0
 */
public class GetRecordsPagerAdapter extends FragmentPagerAdapter {
    private final String[] titles = { "本月领取", "累积领取" };
    private List<Fragment> fragmentLists;

    @Override
    public CharSequence getPageTitle(int position) {
        // TODO Auto-generated method stub
        return titles[position];
    }

    public GetRecordsPagerAdapter(FragmentManager fm,
            List<Fragment> fragmentLists) {
        super(fm);
        this.fragmentLists = fragmentLists;
    }

    @Override
    public Fragment getItem(int position) {
        // TODO Auto-generated method stub
        return fragmentLists.get(position);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return fragmentLists.size();
    }

	

}