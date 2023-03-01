package com.example.ejerciciorecuperacionretrofitpractica.Conexiones;

import com.example.ejerciciorecuperacionretrofitpractica.modelos.DataItem;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiConexiones {
    //1ºDescarga de datos inicial
    //llamada al objeto call de retrofit que recogel el objeto Moneda y que le metodo se llamara getMonedas
//como es la descarga inicial no necesita datos para hacer nada
    @GET("/assets")
    Call<ArrayList<DataItem>> getMonedas();

    /*
    * Una vez que tengo el metodo tengo que marcar ese metodo con el tipo de peticion que tiene que hacer y el endpoint que se
    * tiene que conectar el tipo de pet. es un GET y el endPoint es un /assets/vs
    * */
    //2ºDescarga de una pagina en concreto


}
