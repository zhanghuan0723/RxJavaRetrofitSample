package com.zheling.progress;

import android.content.Context;
import android.widget.Toast;

import com.zheling.subscribers.SubscriberOnNextListener;

import rx.Subscriber;

/**
 * Created by Simon on 2016-10-28.
 */
public class ProgressSubscriber<T> extends Subscriber<T> {

    private final SubscriberOnNextListener mSubscriberOnNextListener;
    private final Context context;

    public ProgressSubscriber(SubscriberOnNextListener mSubscriberOnNextListener, Context context) {
        this.mSubscriberOnNextListener = mSubscriberOnNextListener;
        this.context = context;
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onCompleted() {
        Toast.makeText(context, "Get Top Movie Completed", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onError(Throwable e) {
        Toast.makeText(context, "error:" + e.getMessage(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNext(T t) {
        mSubscriberOnNextListener.onNext(t);
    }
}
