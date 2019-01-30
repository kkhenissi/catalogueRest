package org.sid.fidecoin.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProduit;
    private String nomProduit;
    private Double startPrice;
    private Double currentPrice;
    private int quantiteProduit;
    private boolean selectedProduit;
    private String urlPhoto;
    private Categorie categorie;


    public Long getIdProduit() {
        return idProduit;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public Double getStartPrice() {
        return startPrice;
    }

    public Double getCurrentPrice() {
        return currentPrice;
    }

    public int getQuantiteProduit() {
        return quantiteProduit;
    }

    public boolean isSelectedProduit() {
        return selectedProduit;
    }

    public String getUrlPhoto() {
        return urlPhoto;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public void setStartPrice(Double startPrice) {
        this.startPrice = startPrice;
    }

    public void setCurrentPrice(Double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public void setQuantiteProduit(int quantiteProduit) {
        this.quantiteProduit = quantiteProduit;
    }

    public void setSelectedProduit(boolean selectedProduit) {
        this.selectedProduit = selectedProduit;
    }

    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
}
