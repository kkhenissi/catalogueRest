package org.sid.fidecoin.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class LigneCommande implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long IdLigneCommande;
    @ManyToOne
    @JoinColumn(name = "idProduit")
    private Produit produit;
    private int quantite;
    private Double prix;
    @ManyToOne
    @JoinColumn(name = "idCommande")
    private Commande commande;


    public Long getIdLigneCommande() {
        return IdLigneCommande;
    }

    public void setIdLigneCommande(Long idLigneCommande) {
        IdLigneCommande = idLigneCommande;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }
}
