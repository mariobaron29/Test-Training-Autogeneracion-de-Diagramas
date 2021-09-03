package com.example.AlmacenMotocicletas.controllers;

import com.example.AlmacenMotocicletas.DTOs.MotocicletaDTO;
import com.example.AlmacenMotocicletas.services.MotocicletaActionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "https://catalogomotos.web.app")
@RestController
@RequestMapping("/motocicletas")
public class MotocicletaActionsController {

    @Autowired
    MotocicletaActionsService motocicletaActionsService;

    @GetMapping("/marcas")
    public ResponseEntity<MotocicletaDTO> listByMarca(@PathVariable("marca") String marca){
        return new ResponseEntity(motocicletaActionsService.getByMarca(marca), HttpStatus.OK);
    }

    @GetMapping("/lineas")
    public ResponseEntity<MotocicletaDTO> listByLinea(@PathVariable("linea") String linea){
        return new ResponseEntity(motocicletaActionsService.getByLinea(linea), HttpStatus.OK);
    }

    @GetMapping("/cilindrajes")
    public ResponseEntity<MotocicletaDTO> listByCilindraje(@PathVariable("cilindraje") String cilindraje){
        return new ResponseEntity(motocicletaActionsService.getByCilindraje(cilindraje), HttpStatus.OK);
    }
}
