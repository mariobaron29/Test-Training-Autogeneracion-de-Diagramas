package com.example.AlmacenMotocicletas.repositories;

import com.example.AlmacenMotocicletas.collections.Motocicleta;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MotocicletaRepository extends MongoRepository <Motocicleta, String> {

    List<Motocicleta> findMotocicletaByMarca(String marca);
    List<Motocicleta> findMotocicletaByLinea(String linea);
    List<Motocicleta> findMotocicletaByCilindraje(String cilindraje);
}