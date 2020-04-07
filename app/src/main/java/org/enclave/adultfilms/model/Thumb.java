package org.enclave.adultfilms.model;

import com.google.gson.annotations.SerializedName;

public class Thumb
{
    @SerializedName("size")
    private String size;


    @SerializedName("width")
    private int width;


    @SerializedName("height")
    private int height;


    @SerializedName("src")
    private String src;


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }
}
