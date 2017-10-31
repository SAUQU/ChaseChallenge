package com.example.segundoauqui.chasechallenge.injection.mainactivity;

import com.example.segundoauqui.chasechallenge.view.mainactivity.MainActivityPresenter;

import dagger.Module;
import dagger.Provides;


@Module
public class MainActivityModule {

    @Provides
    MainActivityPresenter providerMainActivityPresenter(){return new MainActivityPresenter();
    }
}
