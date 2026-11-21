/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio 04: Reescribir sin static
 * Enunciado: reescribir un programa con 3 atributos static usando parámetros y return (original comentado y versión nueva).
 * Autor: Andrade Sofia
 * Fecha: 19/11/2026
 */

// ===== VERSIÓN ORIGINAL (comentada) =====
// public class Original {
//     static int base = 10;
//     static int altura = 6;
//     static double area;
//
//     static void calcularArea() {
//         area = base * altura / 2.0;
//     }
//
//     public static void main(String[] args) {
//         calcularArea();
//         System.out.println("Área = " + area);
//     }
// }
// Problema: calcularArea() depende de variables static; no se ve de dónde
// salen sus datos ni dónde queda el resultado.

// ===== VERSIÓN NUEVA (parámetros y return) =====
public class Ej04_ReescribirSinStatic {

    static double calcularArea(int base, int altura) {
        return base * altura / 2.0;
    }

    public static void main(String[] args) {
        int base = 10;
        int altura = 6;

        double area = calcularArea(base, altura);
        System.out.println("Área = " + area);
    }
}