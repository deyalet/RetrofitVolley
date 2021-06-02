package com.example.retrofitvolley;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MostrarRetrofit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_retrofit);
        Bundle bundle = this.getIntent().getExtras();
       // Retrofit retrofit = new Retrofit().Builder.baseUrl(("").addConvertFactory(GsonConverterFactory.create().build());


    }

}