package org.sid.fidecoin.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;
    private String nomClient;
    private String adresseClient;
    private String emailClient;
    private String telepClient;
    @OneToMany(mappedBy = "client")
    private Collection<Commande> commandes;


    public Long getIdClient() {
        return idClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public String getAdresseClient() {
        return adresseClient;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public String getTelepClient() {
        return telepClient;
    }

    public Collection<Commande> getCommandes() {
        return commandes;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public void setAdresseClient(String adresseClient) {
        this.adresseClient = adresseClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    public void setTelepClient(String telepClient) {
        this.telepClient = telepClient;
    }

    public void setCommandes(Collection<Commande> commandes) {
        this.commandes = commandes;
    }


}
