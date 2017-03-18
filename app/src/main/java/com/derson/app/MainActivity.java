package com.derson.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.derson.app.presentation.view.HomeActivity;
import com.foutheaven.cleandagger.base.BaseCleanActivity;

public class MainActivity extends BaseCleanActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_jump).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, HomeActivity.class));
            }
        });
    }


}
