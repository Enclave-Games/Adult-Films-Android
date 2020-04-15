package org.enclave.adultfilms.ui.fragment.home;

import org.enclave.adultfilms.base.BasePresenter;
import org.enclave.adultfilms.http.RedtubeApi;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;


public class HomePresenter extends BasePresenter
{
    private HomeFragment homeFragment;

    @Inject
    RedtubeApi redtubeApi;


    @Inject
    public HomePresenter() {
    }

    public void setView(HomeFragment homeFragment) {
        this.homeFragment = homeFragment;
    }

    public void getVideos()
    {
        disposables.add(redtubeApi.getVideos(null, 5, null, null, null)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(
                        videos -> homeFragment.showVideos(videos),
                        throwable -> homeFragment.showError())
                );
    }

    public void openVideoFragment(String url) {
        homeFragment.openVideo(url);
    }
}
