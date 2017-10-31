package com.example.segundoauqui.chasechallenge.injection.settingsactivity;

import com.example.segundoauqui.chasechallenge.view.settingsactivity.SettingsActivityPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class SettingsActivityModule {

    @Provides
    SettingsActivityPresenter providerSettingsActivityPresenter(){
        return new SettingsActivityPresenter();
    }
}
