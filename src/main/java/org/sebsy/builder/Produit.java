package org.sebsy.builder;

import java.util.ArrayList;
import java.util.List;

public class Produit {

    private String nom;
    private String grade;
    private Categorie categorie;
    private Marque marque;
    private List<Additif> additifs = new ArrayList<>();
    private List<Ingredient> ingredients = new ArrayList<>();
    private List<Allergene> allergenes = new ArrayList<>();

    // Constructeur package-private : seul le Builder peut créer un Produit
    Produit() {}

    // Getters
    public String getNom() { return nom; }
    public String getGrade() { return grade; }
    public Categorie getCategorie() { return categorie; }
    public Marque getMarque() { return marque; }
    public List<Additif> getAdditifs() { return additifs; }
    public List<Ingredient> getIngredients() { return ingredients; }
    public List<Allergene> getAllergenes() { return allergenes; }

    // Setters package-private : seul le Builder peut les utiliser
    void setNom(String nom) { this.nom = nom; }
    void setGrade(String grade) { this.grade = grade; }
    void setCategorie(Categorie categorie) { this.categorie = categorie; }
    void setMarque(Marque marque) { this.marque = marque; }
}