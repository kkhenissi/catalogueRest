package org.sid.fidecoin.entities;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;


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
    private float actualPrice;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateItem;
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="CODE_TVA")
    private Tva tva;
//    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private Collection<Photo> photos;


//    public Item(Long idItem, @NotEmpty @Size(min = 5, max = 100) String nameItem, @NotEmpty String descriptionItem, int quantiteItem, float startPrice) {
//        this.idItem = idItem;
//        this.nameItem = nameItem;
//        this.descriptionItem = descriptionItem;
//        this.quantiteItem = quantiteItem;
//        this.startPrice = startPrice;
//    }
//
//    public Item(long idItem, String nameItem, String descriptionItem, int quantiteItem, float startPrice) {
//    }
}
