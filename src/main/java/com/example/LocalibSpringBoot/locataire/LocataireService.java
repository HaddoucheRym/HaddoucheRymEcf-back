package com.example.LocalibSpringBoot.locataire;

import java.util.List;

public interface LocataireService {

    List<Locataire> findAll();

    /**
     * Sauvegarde ou remplace un locataire
     * si l'entity contient un id, elle remplacera les valeurs deja presantes;
     * sinon elle se sauvegardera
     * @param entity locataire a sauvegarderou modifier
     * @return entity dans l'etat de sauvegarde
     */
    Locataire save(Locataire entity);

    /**
     * Retourne un locataire en fonction de son id
     * si aucun locataire ne posséde cet id, retourne automatiquement un status 404
     * @param id du locattaire recherché
     * @return un locataire
     */
    Locataire findById(String id);

    /**
     * Supprime un locataire en fonction de son id
     * @param id du locataire à supprimer
     */
    void deleteById(String id);
}
