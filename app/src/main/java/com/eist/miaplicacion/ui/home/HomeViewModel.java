package com.eist.miaplicacion.ui.home;

import android.widget.TextView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Aqui se explicara la app y se dira quien la creo");
    }

    public LiveData<String> getText() {
        return mText;
    }
}