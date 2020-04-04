package org.enclave.adultfilms.ui.love_case;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LoveCaseViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public LoveCaseViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}