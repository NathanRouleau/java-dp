package org.sebsy.state;

import org.junit.Assert;
import org.junit.Test;

public class CommandeTest {

    // Cas nominal : parcours complet CREATION → PAIEMENT → EN_LIVRAISON
    @Test
    public void testParcoursNominal() {
        Commande commande = new Commande();

        commande.ajouterProduit(new Produit("Coca", "A"));
        commande.ajouterProduit(new Produit("Pizza", "B"));

        commande.payer();
        Assert.assertEquals(1.0, commande.getMontant(), 0.001);
        Assert.assertTrue(commande.getEtat() instanceof EtatPaiement);

        commande.livrer("10 rue de Paris");
        Assert.assertEquals("10 rue de Paris", commande.getAdresseLivraison());
        Assert.assertTrue(commande.getEtat() instanceof EtatEnLivraison);
    }

    // Cas alternatif : annulation depuis CREATION
    @Test
    public void testAnnulationDepuisCreation() {
        Commande commande = new Commande();
        commande.ajouterProduit(new Produit("Coca", "A"));
        commande.annuler();
        Assert.assertTrue(commande.getEtat() instanceof EtatAnnulee);
    }

    // Cas alternatif : annulation depuis PAIEMENT
    @Test
    public void testAnnulationDepuisPaiement() {
        Commande commande = new Commande();
        commande.ajouterProduit(new Produit("Coca", "A"));
        commande.payer();
        commande.annuler();
        Assert.assertTrue(commande.getEtat() instanceof EtatAnnulee);
    }

    // Cas alternatif : impossible d'annuler EN_LIVRAISON
    @Test
    public void testAnnulationImpossibleEnLivraison() {
        Commande commande = new Commande();
        commande.ajouterProduit(new Produit("Coca", "A"));
        commande.payer();
        commande.livrer("10 rue de Paris");
        commande.annuler(); // doit afficher un message d'erreur
        Assert.assertTrue(commande.getEtat() instanceof EtatEnLivraison); // état inchangé
    }

    // Cas alternatif : impossible d'ajouter un produit après paiement
    @Test
    public void testAjoutProduitApresPaiement() {
        Commande commande = new Commande();
        commande.ajouterProduit(new Produit("Coca", "A"));
        commande.payer();
        commande.ajouterProduit(new Produit("Pizza", "B")); // doit afficher erreur
        Assert.assertEquals(1, commande.getProduits().size()); // toujours 1 seul produit
    }
}