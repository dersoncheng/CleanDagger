package com.foutheaven.cleandagger.manager;

import android.os.Environment;

/**
 * Created by yishengcl on 17/3/17.
 */
public class CacheManager {

    private static final String CACHE_PATH = Environment.getExternalStorageDirectory().getAbsolutePath();

    public CacheManager() {
    }

    public String getCachePath() {
        return CACHE_PATH;
    }
}
