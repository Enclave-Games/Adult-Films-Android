package org.enclave.adultfilms.model.redtube;

import com.google.gson.annotations.SerializedName;

public class Star
{
    @SerializedName("star")
    private StarInfo star;


    public StarInfo getStar() {
        return star;
    }

    public void setStar(StarInfo star) {
        this.star = star;
    }
}
