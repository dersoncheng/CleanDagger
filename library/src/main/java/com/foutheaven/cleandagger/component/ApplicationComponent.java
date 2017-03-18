package com.foutheaven.cleandagger.component;

import android.content.SharedPreferences;

import com.foutheaven.cleandagger.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by yishengcl on 17/3/16.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    SharedPreferences getPreferences();
}
