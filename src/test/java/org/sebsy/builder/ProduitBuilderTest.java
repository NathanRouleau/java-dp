package org.sebsy.builder;

import org.junit.Assert;
import org.junit.Test;

public class ProduitBuilderTest {

    // Cas nominal : produit complet avec tout
    @Test
    public void testProduitComplet() {
        Produit p = new ProduitBuilder()
                .appendNom("Coca-Cola")
                .appendGrade("A")
                .appendCategorie("Boisson")
                .appendMarque("Coca-Cola Company")
                .appendIngredient("Eau", 330.0)
                .appendIngredient("Sucre", 35.0)
                .appendAdditif("E150d", 0.5)
                .appendAllergene("Gluten", 0.1)
                .get();

        Assert.assertNotNull(p);
        Assert.assertEquals("Coca-Cola", p.getNom());
        Assert.assertEquals("A", p.getGrade());
        Assert.assertNotNull(p.getCategorie());
        Assert.assertNotNull(p.getMarque());
        Assert.assertEquals(2, p.getIngredients().size());
        Assert.assertEquals(1, p.getAdditifs().size());
        Assert.assertEquals(1, p.getAllergenes().size());
    }

    // Cas alternatif : produit sans allergènes ni additifs
    @Test
    public void testProduitSansAllergenesSansAdditifs() {
        Produit p = new ProduitBuilder()
                .appendNom("Eau minérale")
                .appendGrade("A+")
                .appendCategorie("Boisson")
                .appendMarque("Evian")
                .appendIngredient("Eau", 500.0)
                .get();

        Assert.assertNotNull(p);
        Assert.assertEquals(0, p.getAllergenes().size());
        Assert.assertEquals(0, p.getAdditifs().size());
        Assert.assertEquals(1, p.getIngredients().size());
    }

    // Cas alternatif : produit minimal sans rien
    @Test
    public void testProduitMinimal() {
        Produit p = new ProduitBuilder()
                .appendNom("Produit test")
                .get();

        Assert.assertNotNull(p);
        Assert.assertEquals("Produit test", p.getNom());
        Assert.assertNull(p.getGrade());
        Assert.assertNull(p.getCategorie());
        Assert.assertEquals(0, p.getIngredients().size());
    }
}