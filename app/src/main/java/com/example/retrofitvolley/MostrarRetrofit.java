package com.example.retrofitvolley;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.retrofitvolley.interfaces.RevistaAPI;
import com.example.retrofitvolley.model.Revista;

import java.security.cert.Extension;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MostrarRetrofit extends AppCompatActivity {
    TextView id;
    TextView volumen;
    TextView numero;
    TextView anio;
    TextView date;
    TextView titulo;
    TextView doi;
    TextView cover;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_retrofit);
        id = findViewById(R.id.txtId);
        volumen = findViewById(R.id.txtVolumen);
        numero = findViewById(R.id.txtNumero);
        anio = findViewById(R.id.txtAnio);
        date = findViewById(R.id.txtPublicacion);
        titulo = findViewById(R.id.txtTitulo);
        doi = findViewById(R.id.txtDoi);
        cover = findViewById(R.id.txtCover);
        Bundle bundle = this.getIntent().getExtras();
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://revistas.uteq.edu.ec/")
                .addConverterFactory(GsonConverterFactory.create()).build();
        RevistaAPI revistaAPI = retrofit.create(RevistaAPI.class);
        Call<Revista> call=revistaAPI.find(bundle.toString());
        call.enqueue(new Callback<Revista>() {
            @Override
            public void onResponse(Call<Revista> call, Response<Revista> response) {
                try{
                    if(response.isSuccessful()){
                        Revista r = response.body();
                        id.setText(r.getId());
                        volumen.setText(r.getId());
                        numero.setText(r.getId());
                        anio.setText(r.getId());
                        date.setText(r.getId());
                        titulo.setText(r.getId());
                        doi.setText(r.getId());
                        cover.setText(r.getId());
                    }

                }catch (Exception ex){
                    Toast.makeText(MostrarRetrofit.this,ex.getMessage(),Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<Revista> call, Throwable t) {
                Toast.makeText(MostrarRetrofit.this,"Error de conexion",Toast.LENGTH_SHORT).show();
            }
        });

    }

}