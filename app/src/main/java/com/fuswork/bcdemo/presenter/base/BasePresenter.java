package com.fuswork.bcdemo.presenter.base;

/**
 * Created by denggaofeng on 2018/1/18.
 */

public interface BasePresenter {

    void subscribe();

    void unSubscribe();

    //Rxjava取消注册，以避免内存泄漏

}
