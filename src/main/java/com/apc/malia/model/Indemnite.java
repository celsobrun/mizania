package com.apc.malia.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "indemnite")
public class Indemnite extends BaseEntity{

    @Column(name = "mode_calcul")
    private int modeCalcul;

    private int type; //TAUX, VALEUR

    private BigDecimal valeur;


    @ManyToOne
    @JoinColumn(name = "famille_indemnite_id")
    private FamilleIndemnite familleIndemnite;


}
