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

public class MostrarVolley extends AppCompatActivity {
    TextView textView;
    RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);


        initUI();
        StringRequest();
    }
    private void initUI(){
        textView = findViewById(R.id.txtResultado);
    }
    public void StringRequest(){
        requestQueue = Volley.newRequestQueue(this);
        Bundle bundle = this.getIntent().getExtras();
        String URL= " https://revistas.uteq.edu.ec/ws/issues.php?j_id="+ bundle.getString("COD");
        StringRequest request = new StringRequest(
                Request.Method.GET,
                URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        textView.setText(response);
                    }
                },
                new Response.ErrorListener(){
                    @Override
                    public void onErrorResponse(VolleyError error){

                    }
                }
        );
        requestQueue.add(request);
    }
}