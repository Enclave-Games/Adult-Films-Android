package org.enclave.adultfilms.http;

import org.enclave.adultfilms.model.Category;
import org.enclave.adultfilms.model.Star;
import org.enclave.adultfilms.model.Video;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RedtubeApi
{
    @GET("/?data=redtube.Videos.searchVideos&output=json")
    Single<List<Video>> getVideos();

    Single<Video> getVideoById(@Query("video_id") int video_id);

    Single<List<Category>> getCategoriesList();

    Single<List<Star>> getStarList();

    Single<Boolean> isVideoActive(@Query("video_id") int video_id);

    Observable<Video> searchVideo(@Query("q") String query);
}
