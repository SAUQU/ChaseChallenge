package com.example.segundoauqui.chasechallenge.view.mainactivity;

import android.app.Activity;
import android.content.Context;

import com.example.segundoauqui.chasechallenge.BasePresenter;
import com.example.segundoauqui.chasechallenge.BaseView;
import com.example.segundoauqui.chasechallenge.model.CurrentObservation;
import com.example.segundoauqui.chasechallenge.model.HourlyForecastOrdered;

import java.util.List;

public interface MainActivityContract {
    interface View extends BaseView{
        void getZipCode(String zipCode);
        void currentWeather(CurrentObservation weather);
        void nextWeather(List<HourlyForecastOrdered> hourlyForecastOrdered);
    }
    interface Presenter extends BasePresenter<View> {
        void init(Activity activity, Context context);
        void getLocation();
        void restCall(String zipCode, Boolean flag);
    }

}
