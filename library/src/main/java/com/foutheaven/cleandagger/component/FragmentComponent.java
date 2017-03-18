package com.foutheaven.cleandagger.component;

import com.foutheaven.cleandagger.annotation.ActivityScope;
import com.foutheaven.cleandagger.base.BaseCleanFragment;
import com.foutheaven.cleandagger.module.ActivityModule;
import com.foutheaven.cleandagger.module.FragmentModule;

import dagger.Component;

/**
 * Created by yishengcl on 17/3/17.
 */
@ActivityScope
@Component(dependencies = ApplicationComponent.class, modules = {ActivityModule.class, FragmentModule.class})
public interface FragmentComponent extends ActivityComponent {

    void inject(BaseCleanFragment baseCleanFragment);
}
