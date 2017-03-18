package com.derson.app.presentation.presenter;

import com.derson.app.data.repository.HomeRepository;
import com.derson.app.domain.usecase.HomeUseCase;
import com.derson.app.presentation.base.BasePresenter;
import com.derson.app.presentation.view.IHomeView;

import rx.Subscriber;

/**
 * Created by yishengcl on 17/3/18.
 */

public class HomePresenter extends BasePresenter<IHomeView> implements IHomePresenter{

    public HomePresenter(IHomeView bindView) {
        super(bindView);
    }

    @Override
    public void loadData() {
        excute(new HomeUseCase(new HomeRepository()).getHomeData(), new HomeSubscriber());
    }

    private  class HomeSubscriber extends Subscriber<String> {
        @Override
        public void onNext(String s) {
            getBindView().updateView(s);
        }

        @Override
        public void onError(Throwable e) {

        }

        @Override
        public void onCompleted() {

        }
    }
}
