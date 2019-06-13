package com.xan.abankdemo2.di.component;

import android.app.Application;

import com.xan.abankdemo2.base.BaseApplication;
import com.xan.abankdemo2.di.ActivityBuilder;
import com.xan.abankdemo2.di.module.AppModule;
import com.xan.abankdemo2.di.module.ContextModule;
import com.xan.abankdemo2.di.module.ViewModelModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component (modules = {ContextModule.class,AppModule.class, AndroidSupportInjectionModule.class, ActivityBuilder.class,ViewModelModule.class})

public interface ApplicationComponent extends AndroidInjector<DaggerApplication> {

    void inject(BaseApplication application);

    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder application(Application application);
        ApplicationComponent build();

    }

}
