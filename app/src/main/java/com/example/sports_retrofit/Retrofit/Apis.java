package com.example.sports_retrofit.Retrofit;

import com.example.sports_retrofit.Model.Sports_categ;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Apis {
    @GET("api/v1/json/1/all_leagues.php")
    Call<Sports_categ> categ_call();

}
