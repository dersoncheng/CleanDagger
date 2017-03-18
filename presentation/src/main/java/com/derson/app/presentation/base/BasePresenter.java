package com.derson.app.presentation.base;


import rx.Observable;
import rx.Subscriber;

/**
 * Created by yishengcl on 17/3/18.
 */

public class BasePresenter<VIEW> {

    /**
     * 绑定视图
     */
    private VIEW mBindView;


    private Executor mExecutor = new Executor();
    /**
     * 构造函数
     *
     * @param bindView 绑定的view
     */
    public BasePresenter(VIEW bindView) {
        mBindView = bindView;
    }

    public void excute(Observable observable, Subscriber subscriber) {
        mExecutor.excute(observable, subscriber);
    }

    public VIEW getBindView() {
        return mBindView;
    }
}
