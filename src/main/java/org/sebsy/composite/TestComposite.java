package org.sebsy.composite;

public class TestComposite {

    public static void main(String[] args) {

        // Employés
        Employe cecile = new Employe("RASPEY", "Cécile", 10000);
        Employe bilel = new Employe("BECHKAR", "Bilel", 8000);

        // Service Big Data
        Employe jb = new Employe("RANMEY", "JB", 7500);
        Employe jane = new Employe("DOE", "Jane", 3500);
        Service bigData = new Service("Big Data");
        bigData.ajouter(jb);
        bigData.ajouter(jane);

        // Service Java Dev
        Employe kevin = new Employe("GUINEAU", "Kevin", 7500);
        Employe paul = new Employe("MARTIN", "Paul", 3500);
        Service javaDev = new Service("Java Dev");
        javaDev.ajouter(kevin);
        javaDev.ajouter(paul);

        // Service DSIN
        Service dsin = new Service("DSIN");
        dsin.ajouter(cecile);
        dsin.ajouter(bilel);
        dsin.ajouter(bigData);
        dsin.ajouter(javaDev);

        System.out.println("=== Salaires par service ===");
        System.out.println("Big Data  : " + bigData.calculerSalaire() + "€");
        System.out.println("Java Dev  : " + javaDev.calculerSalaire() + "€");
        System.out.println("DSIN total: " + dsin.calculerSalaire() + "€");
    }
}