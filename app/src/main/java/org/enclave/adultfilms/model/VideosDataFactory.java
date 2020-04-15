package org.enclave.adultfilms.model;

import androidx.annotation.Nullable;

import com.google.gson.reflect.TypeToken;

import org.enclave.adultfilms.model.redtube.Videos;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

public class VideosDataFactory extends Converter.Factory
{
    @Nullable
    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        Type envelopedType = TypeToken.getParameterized(Videos.class, type).getType();

        final Converter<ResponseBody, Videos> delegate = retrofit.nextResponseBodyConverter(this, envelopedType, annotations);

        return body -> {
            Videos<?> data = delegate.convert(body);
            return data != null ? data.response : null;
        };
    }
}
