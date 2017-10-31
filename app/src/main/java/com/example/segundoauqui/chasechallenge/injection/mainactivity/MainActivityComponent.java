package com.example.segundoauqui.chasechallenge.injection.mainactivity;

import com.example.segundoauqui.chasechallenge.view.mainactivity.MainActivity;

import dagger.Component;

@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {

    void inject(MainActivity mainActivity);
}

