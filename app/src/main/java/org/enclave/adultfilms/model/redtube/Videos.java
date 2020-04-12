package org.enclave.adultfilms.model.redtube;

import java.util.List;

public class Videos
{
    private int count;
    private List<Videos> videos;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Videos> getVideos() {
        return videos;
    }

    public void setVideos(List<Videos> videos) {
        this.videos = videos;
    }
}
