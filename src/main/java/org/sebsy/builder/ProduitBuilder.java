package org.sebsy.builder;

public class ProduitBuilder {

    private Produit produit;

    public ProduitBuilder() {
        this.produit = new Produit();
    }

    // nom du produit
    public ProduitBuilder appendNom(String nom) {
        produit.setNom(nom);
        return this;
    }

    // grade du produit
    public ProduitBuilder appendGrade(String grade) {
        produit.setGrade(grade);
        return this;
    }

    // Crée une categorie
    public ProduitBuilder appendCategorie(String nomCategorie) {
        produit.setCategorie(new Categorie(nomCategorie));
        return this;
    }

    // Crée une marque
    public ProduitBuilder appendMarque(String nomMarque) {
        produit.setMarque(new Marque(nomMarque));
        return this;
    }

    // Crée un additif
    public ProduitBuilder appendAdditif(String nom, double qteMilligrammes) {
        produit.getAdditifs().add(new Additif(nom, qteMilligrammes));
        return this;
    }

    // Crée un ingredient
    public ProduitBuilder appendIngredient(String nom, double qteMilligrammes) {
        produit.getIngredients().add(new Ingredient(nom, qteMilligrammes));
        return this;
    }

    // Crée un allergene
    public ProduitBuilder appendAllergene(String nom, double qteMilligrammes) {
        produit.getAllergenes().add(new Allergene(nom, qteMilligrammes));
        return this;
    }

    public Produit get() {
        return produit;
    }
}