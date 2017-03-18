package com.derson.app.presentation.view;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.derson.app.presentation.R;
import com.foutheaven.cleandagger.base.BaseCleanActivity;

/**
 * Created by yishengcl on 17/3/18.
 */

public class HomeActivity extends BaseCleanActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportFragmentManager().beginTransaction().add(R.id.container, new HomeFragment()).commitAllowingStateLoss();
    }
}
