package org.sebsy.state;

public class EtatEnLivraison implements State {

    @Override
    public void ajouterProduit(Commande commande, Produit produit) {
        System.out.println("Erreur : la commande est déjà en cours de livraison.");
    }

    @Override
    public void payer(Commande commande) {
        System.out.println("Erreur : la commande est déjà en cours de livraison.");
    }

    @Override
    public void livrer(Commande commande, String adresse) {
        System.out.println("Erreur : la commande est déjà en cours de livraison.");
    }

    @Override
    public void annuler(Commande commande) {
        System.out.println("Erreur : la commande est déjà en cours de livraison, l'annulation est impossible.");
    }
} 