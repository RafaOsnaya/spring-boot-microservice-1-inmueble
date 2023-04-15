package com.ro.springbootmicroservice1inmueble.controller;

import com.ro.springbootmicroservice1inmueble.model.Inmueble;
import com.ro.springbootmicroservice1inmueble.service.InmuebleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(name = "api/inmueble")
public class InmuebleController {

    @Autowired
    private InmuebleService inmuebleService;

    @PostMapping
    public ResponseEntity<?> saveInmueble(@RequestBody Inmueble inmueble){
        return new ResponseEntity<>(inmuebleService.saveInmueble(inmueble), HttpStatus.CREATED);
    }

    @DeleteMapping(name = "{inmuebleId}")
    public ResponseEntity<?> deleteInmueble(@PathVariable Long inmuebleId){
        inmuebleService.deleteInmueble(inmuebleId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllInmuebles(){
        return ResponseEntity.ok(inmuebleService.finAllInmuebles());
    }




}
