package org.sid.fidecoin.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Collection;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Item implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idItem;
    @NotEmpty
    @Size(min =5,max=100)
    private String nameItem;
    @NotEmpty
    private String descriptionItem;
    private int quantiteItem;
    private float startPrice;
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="CODE_TVA")
    private Tva tva;
    @OneToMany()
    private Collection<Photo> photos;


    public Item(Long idItem, @NotEmpty @Size(min = 5, max = 100) String nameItem, @NotEmpty String descriptionItem, int quantiteItem, float startPrice) {
        this.idItem = idItem;
        this.nameItem = nameItem;
        this.descriptionItem = descriptionItem;
        this.quantiteItem = quantiteItem;
        this.startPrice = startPrice;
    }

    public Item(long idItem, String nameItem, String descriptionItem, int quantiteItem, float startPrice) {
    }
}
