package com.xan.abankdemo2.di;

import com.xan.abankdemo2.ui.Splash.SplashActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder {
    @ContributesAndroidInjector
    abstract SplashActivity bindSplashActivity();


}
