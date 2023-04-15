package com.ro.springbootmicroservice1inmueble.service;

import com.ro.springbootmicroservice1inmueble.model.Inmueble;
import com.ro.springbootmicroservice1inmueble.repository.InmuebleRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class InmuebleServiceImpl implements InmuebleService{

    //inyectando el objeto por @Autowired
    /*@Autowired
    private InmuebleRepository inmuebleRepository;*/


    //Tambien es posible realizar la inyeccion por medio de constructor
    //En este caso ya no se ocupa @Autowired sino se agrega final a la instancia del objeto

    private final InmuebleRepository inmuebleRepository;
    public InmuebleServiceImpl(InmuebleRepository inmuebleRepository) {
        this.inmuebleRepository = inmuebleRepository;
    }

    //Metodo para almacenar inmueble
    //No olvidar agregar @Override para sobreescribir el metodo en la interfaz
    //Si no definimos el metodo abstracto lo podemos hacer seleccionando pull method
    @Override
    public Inmueble saveInmueble(Inmueble inmueble){
        inmueble.setFechaCreacion(LocalDateTime.now());
        return inmuebleRepository.save(inmueble);
    }

    @Override
    public void deleteInmueble(Long inmuebleId){
        inmuebleRepository.deleteById(inmuebleId);
    }


    @Override
    public List<Inmueble> finAllInmuebles(){
        return inmuebleRepository.findAll();
    }

}
