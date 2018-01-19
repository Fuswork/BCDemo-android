package com.fuswork.bcdemo.contract;

import android.app.Activity;

import com.fuswork.bcdemo.presenter.base.BasePresenter;
import com.fuswork.bcdemo.view.base.BaseView;

/**
 * Created by denggaofeng on 2018/1/19.
 */

public interface BaseContract {
    interface View extends BaseView<Presenter> {
        //
        void initTimers();
    }

    interface Presenter extends BasePresenter{
        //
        void rootCheck(Activity activity);
    }
}
