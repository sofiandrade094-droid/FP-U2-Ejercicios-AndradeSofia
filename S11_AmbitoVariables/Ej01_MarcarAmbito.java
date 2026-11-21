/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio 01: Marcar el ámbito de cada variable
 * Enunciado: programa con un comentario en cada variable que diga si es local, de bloque o static.
 * Autor: Andrade Sofia
 * Fecha: 19/11/2026
 */
public class Ej01_MarcarAmbito {

    static int contadorLlamadas = 0;       // static: de la clase, vive todo el programa
    static double iva = 0.15;              // static: de la clase, visible en todos los métodos

    static double conIva(double precio) {  // precio: local (parámetro), solo vive dentro de conIva
        contadorLlamadas++;
        double total = precio + precio * iva;   // total: local de conIva
        return total;
    }

    public static void main(String[] args) {    // args: local (parámetro) de main
        int cantidad = 3;                  // cantidad: local de main
        double suma = 0;                   // suma: local de main

        for (int i = 1; i <= cantidad; i++) {   // i: de bloque, solo existe dentro del for
            double precio = i * 10.0;      // precio: de bloque, solo dentro del for
            suma = suma + conIva(precio);
        }

        if (suma > 50) {
            String mensaje = "Compra grande";   // mensaje: de bloque, solo dentro del if
            System.out.println(mensaje);
        }

        System.out.println("Suma con IVA: " + suma);
        System.out.println("Llamadas a conIva: " + contadorLlamadas);
    }
}