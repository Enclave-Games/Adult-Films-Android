package org.enclave.adultfilms.base;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.enclave.adultfilms.R;
import org.enclave.adultfilms.model.Videos;
import org.enclave.adultfilms.view.VideoViewHolder;

import java.util.List;

public abstract class BaseAdapter extends RecyclerView.Adapter<VideoViewHolder>
{
    @NonNull
    @Override
    public VideoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VideoViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.video_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VideoViewHolder holder, int position) {

    }

    public abstract void addItems(List<Videos> items);
}
