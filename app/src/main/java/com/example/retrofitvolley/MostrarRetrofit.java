package com.example.retrofitvolley;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.retrofitvolley.interfaces.RevistaAPI;
import com.example.retrofitvolley.model.Revista;

import java.security.cert.Extension;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MostrarRetrofit extends AppCompatActivity {

    String detalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_retrofit);
        Bundle bundle = this.getIntent().getExtras();
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://revistas.uteq.edu.ec/")
                .addConverterFactory(GsonConverterFactory.create()).build();

        RevistaAPI revistaAPI = retrofit.create(RevistaAPI.class);
        Call<List<Revista>> call=revistaAPI.find(bundle.toString());
        call.enqueue(new Callback<List<Revista>>() {
            @Override
            public void onResponse(Call<List<Revista>> call, Response<List<Revista>> response) {
                List<Revista> lj = response.body();
                detalle = "";
                for(Revista str : lj )
                {
                    detalle+=  "ID:"+str.getId()+
                            "Volumen:"+str.getVolumen()+
                            "Número:"+str.getNumero()+
                            "Año:"+str.getAnio()+
                            "Fecha de publicación:"+
                            "Titulo:"+str.getTitulo()+
                            "DOI:"+str.getDoi()+
                            "Cover:"+str.getCover();
                }
            }

            @Override
            public void onFailure(Call<List<Revista>> call, Throwable t) {
                Toast.makeText(MostrarRetrofit.this,"Error de conexion",Toast.LENGTH_SHORT).show();
            }
        });

    }

}