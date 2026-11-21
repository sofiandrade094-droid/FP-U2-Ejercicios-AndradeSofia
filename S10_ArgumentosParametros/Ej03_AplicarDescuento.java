/*
 * Sesión: S10 - Argumentos y parámetros: paso por valor
 * Ejercicio 03: Aplicar descuento a un arreglo de precios
 * Enunciado: aplicarDescuento(double[] precios, double pct) que modifique todo el arreglo; imprimirlo antes y después.
 * Autor: Andrade Sofia
 * Fecha: 19/11/2026
 */
public class Ej03_AplicarDescuento {

    static void aplicarDescuento(double[] precios, double pct) {
        for (int i = 0; i < precios.length; i++) {
            precios[i] = precios[i] - precios[i] * pct / 100;
        }
    }

    static void mostrar(double[] v) {
        for (int k = 0; k < v.length; k++) {
            System.out.print(v[k] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        double[] precios = {100.0, 50.0, 20.0, 8.5};

        System.out.print("Antes: ");
        mostrar(precios);
        aplicarDescuento(precios, 10);
        System.out.print("Después: ");
        mostrar(precios);
    }
}