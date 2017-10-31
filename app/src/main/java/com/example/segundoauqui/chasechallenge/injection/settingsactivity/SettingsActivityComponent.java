package com.example.segundoauqui.chasechallenge.injection.settingsactivity;

import com.example.segundoauqui.chasechallenge.view.settingsactivity.SettingsActivity;

import dagger.Component;


@Component(modules = SettingsActivityModule.class)  //@Component(modules = 1.class,2.class) separated by commas for 2 or more modules
public interface SettingsActivityComponent {

//    void inject(SettingsActivity SettingsActivity); no difference between inject or insert because is the name of the method only in here
    void inject(SettingsActivity SettingsActivity);

}
