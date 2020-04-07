package org.enclave.adultfilms.view.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.enclave.adultfilms.model.Video;
import org.enclave.adultfilms.view.VideoViewHolder;

import java.util.List;

public class HomeVideosAdapter extends RecyclerView.Adapter<VideoViewHolder>
{
    private List<Video> videoList;

    @NonNull
    @Override
    public VideoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull VideoViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return videoList.size();
    }
}
