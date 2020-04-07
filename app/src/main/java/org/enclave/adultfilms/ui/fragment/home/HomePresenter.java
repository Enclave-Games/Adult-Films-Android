package org.enclave.adultfilms.ui.fragment.home;

import org.enclave.adultfilms.base.BasePresenter;
import org.enclave.adultfilms.utils.ApiUtil;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import moxy.InjectViewState;


@InjectViewState
public class HomePresenter extends BasePresenter<HomeView>
{
    public void getVideos()
    {
        disposables.add(ApiUtil.getApiService()
                .getVideos()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(
                        videos -> getViewState().showVideos(videos),
                        throwable -> getViewState().showError())
                );
    }

    public void openVideoFragment(String url) {
        getViewState().openVideo(url);
    }
}
