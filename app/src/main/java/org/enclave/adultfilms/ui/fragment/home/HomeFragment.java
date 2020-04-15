package org.enclave.adultfilms.ui.fragment.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.enclave.adultfilms.AdultFilmsApp;
import org.enclave.adultfilms.R;
import org.enclave.adultfilms.base.BasePresenter;
import org.enclave.adultfilms.base.FragmentPresenter;
import org.enclave.adultfilms.model.redtube.Video;
import org.enclave.adultfilms.view.adapter.HomeVideosAdapter;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;


public class HomeFragment extends FragmentPresenter implements HomeView
{
    private RecyclerView homeRecyclerView;
    private ProgressBar progressBarMain;
    private HomeVideosAdapter homeVideosAdapter;
    private List<Video> videoList;

    @Inject
    HomePresenter homePresenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AdultFilmsApp.getDaggerComponent().inject(this);
    }

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        homeRecyclerView = view.findViewById(R.id.list_videos_home);
        progressBarMain = view.findViewById(R.id.home_progress_bar);
        videoList = new ArrayList<>();
    }


    @Override
    protected BasePresenter getPresenter() {
        return homePresenter;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        homePresenter.setView(this);

        homeVideosAdapter = new HomeVideosAdapter(videoList);
        homeRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        homeRecyclerView.setAdapter(homeVideosAdapter);
        homePresenter.getVideos();
    }

    @Override
    public void showVideos(List<Video> video)
    {
        progressBarMain.setVisibility(View.GONE);
        homeVideosAdapter.addItems(video);
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