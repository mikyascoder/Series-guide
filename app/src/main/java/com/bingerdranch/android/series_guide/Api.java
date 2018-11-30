package com.bingerdranch.android.series_guide;

import com.bingerdranch.android.series_guide.Database.SearchResultWrapper;
import com.bingerdranch.android.series_guide.Database.SeasonEpisodewrapper;
import com.bingerdranch.android.series_guide.Database.Serie;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {
    public static final String BASE_URL="http://www.omdbapi.com";
    public static final String API_KEY="76a34fd";


    @GET("/")
    Call<SearchResultWrapper> getSearchSeries(@Query("apikey") String apikey_value,
                                              @Query("s") String query,
                                              @Query("type") String type);

    @GET("/")
    Call<Serie> getSerieDetails(@Query("apikey") String apikey_value,
                                @Query("t") String title);

    @GET("/")
    Call<SeasonEpisodewrapper> getSeasonepisode(@Query("apikey") String apikey_value,
                                               @Query("i") String id,
                                               @Query("Season") int season);




}


