package com.example.segundoauqui.chasechallenge;


public interface BasePresenter<V extends BaseView> {
    void attachView(V view);
    void detachView();

}
