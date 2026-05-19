package org.sebsy.factory;

import org.junit.Assert;
import org.junit.Test;

public class FactoryTest {

    private IElementFactory factory = new ElementFactory();

    @Test
    public void testCreerIngredient() {
        Element e = factory.createElement(TypeElement.INGREDIENT, "Sucre", 5.0, Unite.MILLI_GRAMMES);
        Assert.assertNotNull(e);
        Assert.assertTrue(e instanceof Ingredient);
        Assert.assertEquals("Sucre", e.getNom());
    }

    @Test
    public void testCreerAdditif() {
        Element e = factory.createElement(TypeElement.ADDITIF, "E150", 2.5, Unite.MICRO_GRAMMES);
        Assert.assertNotNull(e);
        Assert.assertTrue(e instanceof Additif);
    }

    @Test
    public void testCreerAllergene() {
        Element e = factory.createElement(TypeElement.ALLERGENE, "Gluten", 1.0, Unite.MILLI_GRAMMES);
        Assert.assertNotNull(e);
        Assert.assertTrue(e instanceof Allergene);
    }
}
