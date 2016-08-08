package com.example.ok;

import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/** 
 * 类说明：   
 * @author  fuyanan
 * @date    2015-8-19
 * @version 1.0.0
 */
public class MonthGetRecordFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,
            ViewGroup container,  Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        return inflater.inflate(R.layout.month_get_record, container, false);
    }
}