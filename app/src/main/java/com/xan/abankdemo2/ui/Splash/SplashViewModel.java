package com.xan.abankdemo2.ui.Splash;

import com.xan.abankdemo2.base.BaseViewModel;

import javax.inject.Inject;

public class SplashViewModel extends BaseViewModel <SplashNavigator> {
    @Inject
    public SplashViewModel() {
    }
    public void startSplash(){
        getNavigator().openLoginActivity();

    };

}
