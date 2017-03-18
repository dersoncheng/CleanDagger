package com.derson.app.presentation.base;

import java.util.HashSet;
import java.util.Set;

import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by yishengcl on 17/3/18.
 */

public class Executor {
    private static Scheduler sObserverScheduler = AndroidSchedulers.mainThread();
    private static Scheduler sSubscriberScheduler = Schedulers.io();

    private Set<Subscription> mSubscriptions = new HashSet<>();

    private Scheduler mObserverScheduler;
    private Scheduler mSubscriberScheduler;

    public Executor() {
        this(sObserverScheduler, sSubscriberScheduler);
    }

    public Executor(Scheduler observerScheduler, Scheduler subscriberScheduler) {
        mObserverScheduler = observerScheduler;
        mSubscriberScheduler = subscriberScheduler;
    }

    public static void init(Scheduler observerScheduler, Scheduler subscriberScheduler) {
        sObserverScheduler = observerScheduler;
        sSubscriberScheduler = subscriberScheduler;
    }

    public <T> Subscription excute(Observable<T> observable, Subscriber<T> subscriber) {
        Subscription subscription = observable.subscribeOn(mSubscriberScheduler)
                .materialize()
                .observeOn(mObserverScheduler)
                .<T>dematerialize()
                .subscribe(subscriber);
        mSubscriptions.add(subscription);
        return subscription;
    }

    /**
     * 注销所有订阅
     */
    public void unsubscribeAll() {
        for (Subscription subscription : mSubscriptions) {
            if (!subscription.isUnsubscribed()) {
                subscription.unsubscribe();
            }
        }
        mSubscriptions.clear();
    }

}
