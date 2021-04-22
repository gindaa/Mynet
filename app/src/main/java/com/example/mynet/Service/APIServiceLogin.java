package com.example.mynet.Service;

import com.example.mynet.model.Login;
import com.example.mynet.model.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface APIServiceLogin {

    @POST("/user-service/user/login")
    Call<LoginResponse> login (@Body Login login);
}
