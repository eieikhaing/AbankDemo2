package com.xan.abankdemo2.ui;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import com.xan.abankdemo2.BR;
import com.xan.abankdemo2.R;
import com.xan.abankdemo2.base.BaseActivity;
import com.xan.abankdemo2.databinding.SplashLayoutBinding;
import com.xan.abankdemo2.utils.ViewModelFactory;

import javax.inject.Inject;

public class SplashActivity extends BaseActivity<SplashLayoutBinding, SplashViewModel> implements
        SplashNavigator {
    Handler handler;
    @Inject
    ViewModelFactory factory;
    private SplashViewModel splashViewModel;

    public static Intent newIntent(Context context) {
        return new Intent(context, SplashActivity.class);
    }

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.splash_layout;
    }


    @Override
    public SplashViewModel getViewModel() {
        splashViewModel = ViewModelProviders.of(this, factory).get(SplashViewModel.class);
        return splashViewModel;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        splashViewModel.setNavigator(this);

        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                splashViewModel.startSplash();
                finish();
            }
        },3000);

    }

    @Override
    public void openLoginActivity() {
        //Intent intent = LoginActivity.newIntent(SplashActivity.this);
        //startActivity(intent);
        //finish();
        Toast.makeText(this, "This is my Toast message!",
                Toast.LENGTH_LONG).show();

    }
}
