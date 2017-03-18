package com.foutheaven.cleandagger.module;

import android.content.Context;
import android.content.SharedPreferences;

import com.foutheaven.cleandagger.CleanApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yishengcl on 17/3/16.
 * 提供在整个应用周期存活的对象
 */
@Module
public class ApplicationModule {


    private CleanApplication mApplication;

    public ApplicationModule(CleanApplication application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    Context providerApplicationContext() {
        return mApplication;
    }

    @Provides
    @Singleton
    SharedPreferences providerPreferences() {
        return mApplication.getSharedPreferences("common_data", Context.MODE_PRIVATE);
    }

}
