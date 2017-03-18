package com.foutheaven.cleandagger.module;

import android.content.res.Resources;

import com.foutheaven.cleandagger.base.BaseCleanActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yishengcl on 17/3/17.
 */
@Module
public class ActivityModule {

    private BaseCleanActivity mActivity;

    public ActivityModule(BaseCleanActivity activity) {
        mActivity = activity;
    }

    @Provides
    BaseCleanActivity providerActivity() {
        return mActivity;
    }

    @Provides
    Resources providerResource() {
        return mActivity.getResources();
    }
}
