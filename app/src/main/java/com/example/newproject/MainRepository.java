package com.example.newproject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainRepository {
    // Simulated database of valid user credentials
    private static final String[][] VALID_CREDENTIALS = {
            {"user1@example.com", "password1"},
            {"user2@example.com", "password2"},
            {"user3@example.com", "password3"}
    };
    public MainRepository(){

    }
public void loginRemote(LoginBody loginBody,ApiInterfaceResponse loginResponse){
        ApiInterfaceResponse loginService = RetrofitClientInstance.getRetrofit().create(ApiInterfaceResponse.class);
    Call<LoginResponse> initiateLogin = loginService.login(loginBody);
    initiateLogin.enqueue(new Callback<LoginResponse>() {
        @Override
        public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
            if (response.isSuccessful()){
                LoginResponse.onResponse(response.body());
        }else {
                loginResponse.onFailure();(new Throwable(response.message());
            }
        }

        @Override
        public void onFailure(Call<LoginResponse> call, Throwable t) {
         loginResponse.onFailure(t);
        }
    });
}
    // Method to check if the provided email and password match valid credentials
    public static boolean isValidCredentials(String email, String password) {
        for (String[] credentials : VALID_CREDENTIALS) {
            if (credentials[0].equals(email) && credentials[1].equals(password)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public interface ApiInterfaceResponse {
        void onResponse(LoginResponse loginResponse);

        void onFailure(Throwable)
    }
    }
