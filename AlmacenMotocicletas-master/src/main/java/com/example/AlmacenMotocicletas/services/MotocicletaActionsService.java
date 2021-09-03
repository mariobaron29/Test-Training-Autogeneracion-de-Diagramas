package com.example.AlmacenMotocicletas.services;

import com.example.AlmacenMotocicletas.DTOs.MotocicletaDTO;
import com.example.AlmacenMotocicletas.collections.Motocicleta;
import com.example.AlmacenMotocicletas.mappers.MotocicletaMapper;
import com.example.AlmacenMotocicletas.repositories.MotocicletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotocicletaActionsService {

    @Autowired
    MotocicletaRepository motocicletaRepository;

    MotocicletaMapper mapper = new MotocicletaMapper();

    public List<MotocicletaDTO> getByMarca(String marca){
        List<Motocicleta> motocicletas = motocicletaRepository.findMotocicletaByMarca(marca);
        return mapper.fromCollectionList(motocicletas);
    }

    public List<MotocicletaDTO> getByLinea(String linea){
        List<Motocicleta> motocicletas = motocicletaRepository.findMotocicletaByLinea(linea);
        return mapper.fromCollectionList(motocicletas);
    }

    public List<MotocicletaDTO> getByCilindraje(String cilindraje){
        List<Motocicleta> motocicletas = motocicletaRepository.findMotocicletaByCilindraje(cilindraje);
        return mapper.fromCollectionList(motocicletas);
    }
}