package com.algaworks.erp;

import static com.algaworks.erp.matematica.CalculadoraArea.*;
import static com.algaworks.erp.matematica.CalculadoraArea.calcularAreaCirculo;
import static com.algaworks.erp.matematica.CalculadoraArea.calcularAreaQuadrado;

public class Principal2 {
    public static void main(String[] args) {
        double areaQuadrado = calcularAreaQuadrado(5.2);
        double areaCirculo = calcularAreaCirculo(10.5);

        System.out.printf("PI: %2f%n", PI);
        System.out.printf("Area do quadrado: %.2f%n", areaQuadrado);
        System.out.printf("Area do circulo: %.2f%n", areaCirculo);

    }
}
