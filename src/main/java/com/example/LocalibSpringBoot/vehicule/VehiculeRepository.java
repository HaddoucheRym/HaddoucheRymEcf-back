package com.example.LocalibSpringBoot.vehicule;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VehiculeRepository extends MongoRepository<Vehicule, String> {

    List<Vehicule> findByMarque(String marque);

    List<Vehicule> findByModel(String model);

    List<Vehicule> findByImmatriculation(String immatriculation);

    List<Vehicule> findByDisponibilite(Disponibilite disponibilite);

    List<Vehicule> findByTypeVehicule(TypeVehicule typeVehicule);
}
