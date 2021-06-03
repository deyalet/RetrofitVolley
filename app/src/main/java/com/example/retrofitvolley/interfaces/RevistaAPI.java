package com.example.retrofitvolley.interfaces;

import com.example.retrofitvolley.model.Revista;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RevistaAPI {
    @GET("ws/issues.php")
    public Call<List<Revista>> find(@Path("j_id")String id);
}
