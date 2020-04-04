package org.enclave.adultfilms.ui.popular_videos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PopularVideosModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PopularVideosModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}