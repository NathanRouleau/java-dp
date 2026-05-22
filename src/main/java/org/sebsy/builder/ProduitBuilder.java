package org.sebsy.builder;

public class ProduitBuilder {

    private Produit produit;

    public ProduitBuilder() {
        this.produit = new Produit();
    }

    // Chaîne le nom du produit
    public ProduitBuilder appendNom(String nom) {
        produit.setNom(nom);
        return this;
    }

    // Chaîne le grade du produit
    public ProduitBuilder appendGrade(String grade) {
        produit.setGrade(grade);
        return this;
    }

    // Crée une Categorie en interne à partir d'une String
    public ProduitBuilder appendCategorie(String nomCategorie) {
        produit.setCategorie(new Categorie(nomCategorie));
        return this;
    }

    // Crée une Marque en interne à partir d'une String
    public ProduitBuilder appendMarque(String nomMarque) {
        produit.setMarque(new Marque(nomMarque));
        return this;
    }

    // Crée un Additif en interne à partir de types primitifs
    public ProduitBuilder appendAdditif(String nom, double qteMilligrammes) {
        produit.getAdditifs().add(new Additif(nom, qteMilligrammes));
        return this;
    }

    // Crée un Ingredient en interne à partir de types primitifs
    public ProduitBuilder appendIngredient(String nom, double qteMilligrammes) {
        produit.getIngredients().add(new Ingredient(nom, qteMilligrammes));
        return this;
    }

    // Crée un Allergene en interne à partir de types primitifs
    public ProduitBuilder appendAllergene(String nom, double qteMilligrammes) {
        produit.getAllergenes().add(new Allergene(nom, qteMilligrammes));
        return this;
    }

    // Retourne le Produit final
    public Produit get() {
        return produit;
    }
}