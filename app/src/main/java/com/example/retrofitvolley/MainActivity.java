package com.example.retrofitvolley;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnVolley(View view){
        Intent intent = new Intent(MainActivity.this, MostrarVolley.class);
        EditText txtCod = (EditText)findViewById(R.id.txtCodigo);
        Bundle b = new Bundle();
        b.putString("COD", txtCod.getText().toString());
        intent.putExtras(b);
        startActivity(intent);
    }
    public void btnRetrofit(View view){
        Intent intent = new Intent(MainActivity.this, MostrarRetrofit.class);
        EditText txtCod = (EditText)findViewById(R.id.txtCodigo);
        Bundle b = new Bundle();
        b.putString("COD", txtCod.getText().toString());
        intent.putExtras(b);
        startActivity(intent);
    }


}