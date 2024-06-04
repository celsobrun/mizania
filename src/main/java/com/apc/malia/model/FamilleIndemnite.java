package com.apc.malia.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "famille_indemnite")
public class FamilleIndemnite extends BaseEntity{

    private String designation;

    @Column(name = "est_imposable")
    private boolean estImposable;

    @Column(name = "est_cotisable")
    private boolean estCotisable;

    @Column(name = "est_avec_salaire_principal")
    private boolean estAvecSP;


    @OneToMany(mappedBy = "familleIndemnite", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Indemnite> indemnites;


}
