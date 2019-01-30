package org.sid.fidecoin.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Commande implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long IdCommande;
    private Date dateCommande;
    @OneToMany(mappedBy = "commande")
    private Collection<LigneCommande> ligneCommandes;
    @ManyToOne
    @JoinColumn(name = "idClient")
    private Client client;

    public Long getIdCommande() {
        return IdCommande;
    }

    public void setIdCommande(Long idCommande) {
        IdCommande = idCommande;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public Collection<LigneCommande> getLigneCommandes() {
        return ligneCommandes;
    }

    public void setLigneCommandes(Collection<LigneCommande> ligneCommandes) {
        this.ligneCommandes = ligneCommandes;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
