package com.derson.app.data.repository;

import rx.Observable;

/**
 * Created by yishengcl on 17/3/18.
 */

public class HomeRepository {

    /**
     * @return 获取首页数据
     */
    public Observable<String> getHomeData() {
        return Observable.just("Home data");
    }
}
