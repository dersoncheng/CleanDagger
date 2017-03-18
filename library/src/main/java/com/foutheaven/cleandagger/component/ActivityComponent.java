package com.foutheaven.cleandagger.component;

import com.foutheaven.cleandagger.annotation.ActivityScope;
import com.foutheaven.cleandagger.base.BaseCleanActivity;
import com.foutheaven.cleandagger.module.ActivityModule;

import dagger.Component;

/**
 * Created by yishengcl on 17/3/17.
 */
@ActivityScope
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {


    void inject(BaseCleanActivity baseCleanActivity);
}
