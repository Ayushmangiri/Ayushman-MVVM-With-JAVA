package com.example.newproject;

import com.google.gson.annotations.SerializedName;

public class LoginResponse {
    @SerializedName("token")
    String Token;

    public String getToken() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
    }
}
