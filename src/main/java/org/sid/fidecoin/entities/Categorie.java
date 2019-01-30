package org.sid.fidecoin.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Collection;
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Categorie implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCategorie;
    private String nomCategoris;
    private String description;
    private byte[] photo;
    private String nomPhoto;
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
