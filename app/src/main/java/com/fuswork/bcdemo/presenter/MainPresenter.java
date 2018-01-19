package com.fuswork.bcdemo.presenter;

import android.app.Activity;
import android.content.Context;

import com.fuswork.bcdemo.contract.BaseContract;

/**
 * Created by denggaofeng on 2018/1/19.
 */

public final class MainPresenter implements BaseContract.Presenter{


    private Context context;
    private BaseContract.View baseView;

    public MainPresenter(Context context,BaseContract.View view){
        this.context = context;
        this.baseView = view;

        this.baseView.setPresenter(this);

    }

    @Override
    public void rootCheck(final Activity activity){

    }

    @Override
    public void subscribe(){
        this.rootCheck((Activity) context);
    }

    @Override
    public void unSubscribe(){

    }
}
