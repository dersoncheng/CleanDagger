package com.derson.app.presentation.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.derson.app.presentation.R;
import com.derson.app.presentation.presenter.HomePresenter;
import com.foutheaven.cleandagger.base.BaseCleanFragment;

/**
 * Created by yishengcl on 17/3/18.
 */

public class HomeFragment extends BaseCleanFragment implements IHomeView{

    private HomePresenter mHomePresenter;

    private TextView mTvContent;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mHomePresenter = new HomePresenter(this);
    }

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
        mTvContent = (TextView) rootView.findViewById(R.id.content);
        return rootView;
    }

    @Override
    public void onResume() {
        super.onResume();
        mHomePresenter.loadData();
    }

    @Override
    public void updateView(String content) {
        mTvContent.setText(content);

    }
}
