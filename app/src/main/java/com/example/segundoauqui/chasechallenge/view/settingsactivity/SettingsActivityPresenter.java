package com.example.segundoauqui.chasechallenge.view.settingsactivity;

public class SettingsActivityPresenter implements SettingsActivityContract.Presenter {
    SettingsActivityContract.View view;
    private static final String TAG = "SettingsActivityPresenter";

    @Override
    public void attachView(SettingsActivityContract.View view) {
        this.view = view;
    }
    @Override
    public void detachView() {
        this.view = null;
    }


}
