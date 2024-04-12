package com.example.newproject;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiInterface {
        @POST("/megma-recharge/login-user")
        Call<LoginResponse> callLoginResponse(@Body LoginBody loginBody);
}