package com.example.LocalibSpringBoot.vehicule;

import java.util.List;

public interface VehiculeService {

    /**
     * afficcher et recuperer la liste de tous les vehicules
     * @return la liste des vehicules
     */
    List<Vehicule> findAll();

    /**
     * Sauvegarde ou remplace un vehicule
     * si l'entity contient un id, elle remplacera les valeurs deja presantes;
     * sinon elle se sauvegardera
     * @param entity vehicule a sauvegarder ou modifier
     * @return entity dans l'etat de sauvegarde
     */
    Vehicule save(Vehicule entity);

    /**
     * Retourne un vehicule en fonction de son id
     * si aucun vehicule ne posséde cet id, retourne automatiquement un status 404
     * @param id du vehicule recherché
     * @return un vehicule
     */
    Vehicule findById(String id);

    /**
     * Supprime un vehicule en fonction de son id
     * @param id du vehicule à supprimer
     */
    void deleteById(String id);
}
