package com.example.LocalibSpringBoot.location;

import com.example.LocalibSpringBoot.locataire.Locataire;
import com.example.LocalibSpringBoot.vehicule.Vehicule;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Location {

    @Id
    private String id;
    @JsonFormat(pattern = "yyyy/MM/dd")
    private LocalDate dateDebut;
    @JsonFormat(pattern = "yyyy/MM/dd")
    private LocalDate dateFin;

    @DBRef
    private Locataire locataire;

    @DBRef
    private Vehicule vehicule;

    /**
     * pouvoir calculer le prix total de location d'une vehicule par rapport au nombres de jour de location
     * @return prixt: le prix total d'une location de vehicule
     */

    public double getPrixt() {
//          System.out.println(this.vehicule.getPrix());
//          System.out.println( (int) ChronoUnit.YEARS.between(this.dateFin, this.dateDebut));
        double prixt = (ChronoUnit.DAYS.between(this.dateDebut,this.dateFin))*this.vehicule.getPrix();
//          System.out.println(prixt);
        return prixt ;
    }
}
