package com.example.sports_retrofit.Retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Retro_config {
    public  Apis getApis()
    {

        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://www.thesportsdb.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Apis apis=retrofit.create(Apis.class);
      return apis;
    }
}
