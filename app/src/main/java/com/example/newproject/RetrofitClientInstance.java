package com.example.newproject;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance {
    public static Retrofit retrofit;

    public static Retrofit getRetrofit() {
        if (retrofit == null);
        retrofit = new Retrofit.Builder()
                .baseUrl("http://43.205.74.56:1234")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return null;
    }
}
