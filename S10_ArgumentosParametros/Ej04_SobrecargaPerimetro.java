/*
 * Sesión: S10 - Argumentos y parámetros: paso por valor
 * Ejercicio 04: Sobrecarga del método perimetro
 * Enunciado: perimetro(double lado) para el cuadrado y perimetro(double a, double b) para el rectángulo, llamados desde main.
 * Autor: Andrade Sofia
 * Fecha: 19/11/2026
 */
public class Ej04_SobrecargaPerimetro {

    static double perimetro(double lado) {
        return 4 * lado;
    }

    static double perimetro(double a, double b) {
        return 2 * (a + b);
    }

    public static void main(String[] args) {
        System.out.println("Perímetro del cuadrado de lado 5 = " + perimetro(5));
        System.out.println("Perímetro del rectángulo 6 x 4 = " + perimetro(6, 4));
    }
}