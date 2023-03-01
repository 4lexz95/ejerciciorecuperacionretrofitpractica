package com.example.ejerciciorecuperacionretrofitpractica.Conexiones;

import com.example.ejerciciorecuperacionretrofitpractica.Constantes.Constante;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitObject {
    public static Retrofit getConexion(){
        return new Retrofit.Builder().baseUrl(Constante.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()).build();


    }


}
