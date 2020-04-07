package org.enclave.adultfilms.ui.fragment.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.enclave.adultfilms.R;
import org.enclave.adultfilms.base.BasePresenter;
import org.enclave.adultfilms.base.FragmentPresenter;
import org.enclave.adultfilms.model.Video;
import org.enclave.adultfilms.utils.FragmentUtil;
import org.enclave.adultfilms.view.adapter.HomeVideosAdapter;

import java.util.List;

import moxy.presenter.InjectPresenter;
import moxy.presenter.ProvidePresenter;

public class HomeFragment extends FragmentPresenter implements HomeView
{
    private RecyclerView homeRecyclerView;
    private HomeVideosAdapter homeVideosAdapter;

    @InjectPresenter
    HomePresenter homePresenter;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        homeRecyclerView = view.findViewById(R.id.list_videos_home);
        homeVideosAdapter = new HomeVideosAdapter();
    }

    @ProvidePresenter
    HomePresenter provideHomePresenter() {
        return new HomePresenter();
    }

    @Override
    protected BasePresenter getPresenter() {
        return homePresenter;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void showVideos(List<Video> videos)
    {

    }

    @Override
    public void openVideo(String url) {
        homePresenter.openVideoFragment(url);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showError() {

    }
}