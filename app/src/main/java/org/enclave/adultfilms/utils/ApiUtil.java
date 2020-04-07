package org.enclave.adultfilms.utils;

import com.google.gson.Gson;

import org.enclave.adultfilms.BuildConfig;
import org.enclave.adultfilms.http.RedtubeApi;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUtil
{
    private static Retrofit sRetrofit;
    private static RedtubeApi redtubeApi;


    private static Retrofit getRetrofit() {
        if (sRetrofit == null) {
            sRetrofit = new Retrofit.Builder()
                    .baseUrl(AppConstants.API_URL)
                    .client(new OkHttpClient())
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        }
        return sRetrofit;
    }

    public static RedtubeApi getApiService() {
        if (redtubeApi == null) {
            redtubeApi = getRetrofit().create(RedtubeApi.class);
        }
        return redtubeApi;
    }
}
