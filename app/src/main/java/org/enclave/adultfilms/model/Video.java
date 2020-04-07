package org.enclave.adultfilms.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Video
{
    @SerializedName("duration")
    private String duration;


    @SerializedName("views")
    private String views;


    @SerializedName("video_id")
    private String video_id;


    @SerializedName("rating")
    private String rating;


    @SerializedName("ratings")
    private String ratings;


    @SerializedName("title")
    private String title;


    @SerializedName("url")
    private String url;


    @SerializedName("default_thumb")
    private String default_thumb;


    @SerializedName("thumb")
    private String thumb;


    @SerializedName("publish_date")
    private String publish_date;


    @SerializedName("thumbs")
    private List<Thumb> thumbs;


    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getVideo_id() {
        return video_id;
    }

    public void setVideo_id(String video_id) {
        this.video_id = video_id;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDefault_thumb() {
        return default_thumb;
    }

    public void setDefault_thumb(String default_thumb) {
        this.default_thumb = default_thumb;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(String publish_date) {
        this.publish_date = publish_date;
    }

    public List<Thumb> getThumbs() {
        return thumbs;
    }

    public void setThumbs(List<Thumb> thumbs) {
        this.thumbs = thumbs;
    }

    //public Tags tags;
}
