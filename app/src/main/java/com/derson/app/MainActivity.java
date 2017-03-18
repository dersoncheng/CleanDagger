package com.derson.app;

import android.os.Bundle;

import com.foutheaven.cleandagger.base.BaseCleanActivity;

public class MainActivity extends BaseCleanActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainFragment fragment = new MainFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container, fragment).commitAllowingStateLoss();
    }


}
