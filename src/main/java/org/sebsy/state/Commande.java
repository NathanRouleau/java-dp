package org.sebsy.state;

import java.util.ArrayList;
import java.util.List;

public class Commande {

    private double montant;
    private String adresseLivraison;
    private State etat;
    private List<Produit> produits = new ArrayList<>();

    public Commande() {
        // Une commande démarre toujours en état CREATION
        this.etat = new EtatCreation();
    }

    // Les méthodes délèguent à l'état courant
    public void ajouterProduit(Produit produit) {
        etat.ajouterProduit(this, produit);
    }

    public void payer() {
        etat.payer(this);
    }

    public void livrer(String adresse) {
        etat.livrer(this, adresse);
    }

    public void annuler() {
        etat.annuler(this);
    }

    // Getters et setters
    public double getMontant() { return montant; }
    public void setMontant(double montant) { this.montant = montant; }

    public String getAdresseLivraison() { return adresseLivraison; }
    public void setAdresseLivraison(String adresse) { this.adresseLivraison = adresse; }

    public State getEtat() { return etat; }
    public void setEtat(State etat) { this.etat = etat; }

    public List<Produit> getProduits() { return produits; }
}