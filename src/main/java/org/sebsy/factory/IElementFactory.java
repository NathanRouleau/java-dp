package org.sebsy.factory;

public interface IElementFactory {
    Element createElement(TypeElement type, String nom, double valeur, Unite unite);
}
