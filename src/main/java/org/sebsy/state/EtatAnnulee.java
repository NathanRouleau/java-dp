package org.sebsy.state;

public class EtatAnnulee implements State {

    @Override
    public void ajouterProduit(Commande commande, Produit produit) {
        System.out.println("Erreur : la commande a déjà été annulée.");
    }

    @Override
    public void payer(Commande commande) {
        System.out.println("Erreur : la commande a déjà été annulée.");
    }

    @Override
    public void livrer(Commande commande, String adresse) {
        System.out.println("Erreur : la commande a déjà été annulée.");
    }

    @Override
    public void annuler(Commande commande) {
        System.out.println("Erreur : la commande a déjà été annulée.");
    }
}