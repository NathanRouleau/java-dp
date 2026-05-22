package org.sebsy.composite;

import java.util.ArrayList;
import java.util.List;

public class Service implements IElement {

    private String nom;
    private List<IElement> elements = new ArrayList<>();

    public Service(String nom) {
        this.nom = nom;
    }

    public void ajouter(IElement element) {
        elements.add(element);
    }

    @Override
    public double calculerSalaire() {
        double total = 0;
        for (IElement element : elements) {
            total += element.calculerSalaire();
        }
        return total;
    }

    public String getNom() { return nom; }
    public List<IElement> getElements() { return elements; }
}