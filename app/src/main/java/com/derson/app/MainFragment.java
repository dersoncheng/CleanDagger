package com.derson.app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.foutheaven.cleandagger.base.BaseCleanFragment;

/**
 * Created by yishengcl on 17/3/17.
 */

public class MainFragment extends BaseCleanFragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, null);
        rootView.findViewById(R.id.btn_save).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPreferences.edit().putInt("new_item", 65535).apply();
            }
        });
        rootView.findViewById(R.id.btn_load).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ni = mPreferences.getInt("new_item", 0);
                Toast.makeText(mActivity, mResources.getString(R.string.toast_label, ni), Toast.LENGTH_LONG).show();
            }
        });
        return rootView;
    }
}
