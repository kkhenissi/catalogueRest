package org.sid.fidecoin.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Collection;
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Categorie implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCategorie;
    @NotEmpty
    @Size(min = 5, max= 20)
    private String nomCategoris;
    @Size(min=5)
    private String description;
    @Lob
    private byte[] photo;
    private String nomPhoto;
    @OneToMany(mappedBy = "categorie")
    private Collection<Produit> produits;

    public Long getIdCategorie() {
        return idCategorie;
    }

    public String getNomCategoris() {
        return nomCategoris;
    }

    public String getDescription() {
        return description;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public String getNomPhoto() {
        return nomPhoto;
    }
    @JsonIgnore
    public Collection<Produit> getProduits() {
        return produits;
    }

    public void setNomCategoris(String nomCategoris) {
        this.nomCategoris = nomCategoris;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public void setNomPhoto(String nomPhoto) {
        this.nomPhoto = nomPhoto;
    }

    public void setProduits(Collection<Produit> produits) {
        this.produits = produits;
    }
}
