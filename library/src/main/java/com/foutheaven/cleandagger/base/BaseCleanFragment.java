package com.foutheaven.cleandagger.base;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.foutheaven.cleandagger.CleanApplication;
import com.foutheaven.cleandagger.component.DaggerFragmentComponent;
import com.foutheaven.cleandagger.module.ActivityModule;
import com.foutheaven.cleandagger.module.FragmentModule;

import javax.inject.Inject;

/**
 * Created by yishengcl on 17/3/16.
 */

public class BaseCleanFragment extends Fragment {

    @Inject
    protected SharedPreferences mPreferences;

    @Inject
    protected BaseCleanActivity mActivity;

    @Inject
    protected Resources mResources;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerFragmentComponent.builder()
                .applicationComponent(((CleanApplication) getActivity().getApplication()).getApplicationComponent())
                .activityModule(new ActivityModule((BaseCleanActivity) getActivity()))
                .fragmentModule(new FragmentModule())
                .build().inject(this);
    }
}
