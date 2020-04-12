package org.enclave.adultfilms.model.redtube;

import java.util.List;

public class Video
{
    private String duration;
    private String views;
    private String video_id;
    private String rating;
    private String ratings;
    private String title;
    private String url;
    private String embed_url;
    private String default_thumb;
    private String thumb;
    private boolean publish_date;
    private List<Thumbs> thumbs;
    private List<Tags> tags;

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

    public String getEmbed_url() {
        return embed_url;
    }

    public void setEmbed_url(String embed_url) {
        this.embed_url = embed_url;
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

    public boolean isPublish_date() {
        return publish_date;
    }

    public void setPublish_date(boolean publish_date) {
        this.publish_date = publish_date;
    }

    public List<Thumbs> getThumbs() {
        return thumbs;
    }

    public void setThumbs(List<Thumbs> thumbs) {
        this.thumbs = thumbs;
    }

    public List<Tags> getTags() {
        return tags;
    }

    public void setTags(List<Tags> tags) {
        this.tags = tags;
    }
}
