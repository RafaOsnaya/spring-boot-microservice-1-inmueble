package com.ro.springbootmicroservice1inmueble.service;

import com.ro.springbootmicroservice1inmueble.model.Inmueble;

import java.util.List;

public interface InmuebleService {
    //Metodo para almacenar inmueble
    //No olvidar agregar @Override para sobreescribir el metodo en la interfaz
    //Si no definimos el metodo abstracto lo podemos hacer seleccionando pull method
    Inmueble saveInmueble(Inmueble inmueble);

    void deleteInmueble(Long inmuebleId);

    List<Inmueble> finAllInmuebles();
}
