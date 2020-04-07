package org.enclave.adultfilms.view;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;

public class VideoViewHolder extends RecyclerView.ViewHolder
{
    public MaterialCardView cardView;


    public VideoViewHolder(@NonNull View itemView) {
        super(itemView);
    }
}
