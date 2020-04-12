package org.enclave.adultfilms.model.redtube;

import com.google.gson.annotations.SerializedName;

public class StarInfo
{
    @SerializedName("star")
    private String starName;


    @SerializedName("star_thumb")
    private String starThumb;


    @SerializedName("star_url")
    private String starUrl;



    public String getStarThumb() {
        return starThumb;
    }

    public void setStarThumb(String starThumb) {
        this.starThumb = starThumb;
    }

    public String getStarUrl() {
        return starUrl;
    }

    public void setStarUrl(String starUrl) {
        this.starUrl = starUrl;
    }

    public String getStarName() {
        return starName;
    }

    public void setStarName(String starName) {
        this.starName = starName;
    }
}
