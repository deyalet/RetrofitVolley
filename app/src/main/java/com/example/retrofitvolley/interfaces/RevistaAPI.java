package com.example.retrofitvolley.interfaces;

import com.example.retrofitvolley.model.Revista;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RevistaAPI {
    @GET("https://revistas.uteq.edu.ec/ws/issues.php?{id}")
    public Call<Revista> find(@Path("id")String id);

}
