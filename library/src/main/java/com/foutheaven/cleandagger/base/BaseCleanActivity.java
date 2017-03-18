package com.foutheaven.cleandagger.base;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

import com.foutheaven.cleandagger.CleanApplication;
import com.foutheaven.cleandagger.component.DaggerActivityComponent;
import com.foutheaven.cleandagger.module.ActivityModule;

import javax.inject.Inject;

/**
 * Created by yishengcl on 17/3/16.
 */

public class BaseCleanActivity extends FragmentActivity {

    @Inject
    protected Resources mResources;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerActivityComponent.builder()
                .applicationComponent(((CleanApplication) getApplication()).getApplicationComponent())
                .activityModule(new ActivityModule(this))
                .build().inject(this);
    }
}
