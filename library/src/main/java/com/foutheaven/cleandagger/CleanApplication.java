package com.foutheaven.cleandagger;

import android.app.Application;

import com.foutheaven.cleandagger.component.ApplicationComponent;
import com.foutheaven.cleandagger.component.DaggerApplicationComponent;
import com.foutheaven.cleandagger.module.ApplicationModule;

/**
 * Created by yishengcl on 17/3/16.
 */

public class CleanApplication extends Application {

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }
}
