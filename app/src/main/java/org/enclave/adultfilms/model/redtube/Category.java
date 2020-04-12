package org.enclave.adultfilms.model.redtube;

import com.google.gson.annotations.SerializedName;

public class Category
{
    @SerializedName("category")
    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
