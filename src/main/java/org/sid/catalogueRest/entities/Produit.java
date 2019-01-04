package org.sid.catalogueRest.entities;

import lombok.*;
import org.springframework.data.annotation.Id;

@Data @AllArgsConstructor @NoArgsConstructor @ToString @Getter @Setter @EqualsAndHashCode
public class Produit {

    @Id
    private String ref;

    private int quantite;

    private float prixUnitaire;

}
