package com.derson.app.domain.usecase;

import com.derson.app.data.repository.HomeRepository;

import rx.Observable;

/**
 * Created by yishengcl on 17/3/18.
 */

public class HomeUseCase {


    private HomeRepository mRepository;

    public HomeUseCase(HomeRepository repository) {
        mRepository = repository;
    }

    public Observable<String> getHomeData() {
        return mRepository.getHomeData();
    }
}
