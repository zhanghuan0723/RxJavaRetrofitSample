package com.zheling.subscribers;

/**
 * Created by Simon on 2016-10-28.
 */
public interface SubscriberOnNextListener<T> {
    void onNext(T t);
}
