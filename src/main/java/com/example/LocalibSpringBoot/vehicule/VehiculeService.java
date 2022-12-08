package com.example.LocalibSpringBoot.vehicule;

import java.util.List;

public interface VehiculeService {

    List<Vehicule> findAll();

    Vehicule save(Vehicule entity);

    Vehicule findById(String id);

    void deleteById(String id);
}
