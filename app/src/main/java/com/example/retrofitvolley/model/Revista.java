package com.example.retrofitvolley.model;

import java.util.Date;

public class Revista {
    private String id;
    private String volumen;
    private String numero;
    private String anio;
    private String date;
    private String titulo;
    private String doi;
    private String cover;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVolumen() {
        return volumen;
    }

    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Revista(String id, String volumen, String numero, String anio, String date, String titulo, String doi, String cover) {
        this.id = id;
        this.volumen = volumen;
        this.numero = numero;
        this.anio = anio;
        this.date = date;
        this.titulo = titulo;
        this.doi = doi;
        this.cover = cover;
    }
}
