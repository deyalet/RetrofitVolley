package com.example.retrofitvolley.interfaces;

import com.example.retrofitvolley.model.Revista;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RevistaAPI {
    @GET("ws/issues.php?j_id={id}")
    public Call<Revista> find(@Path("id")String id);

}
