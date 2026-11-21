/*
 * Sesión: S10 - Argumentos y parámetros: paso por valor
 * Ejercicio 05: Predicción de salida
 * Enunciado: programa con 3 llamadas; escribir la salida predicha y luego la salida real.
 * Autor: Andrade Sofia
 * Fecha: 19/11/2026
 */
public class Ej05_PrediccionSalida {

    static void sumarCinco(int i) {
        i = i + 5;
        System.out.println("Dentro de sumarCinco: n = " + i);
    }

    static int duplicar(int x) {
        x = x * 2;
        return x;
    }

    static void sumarDiez(int[] v) {
        v[0] = v[0] + 10;
    }

    public static void main(String[] args) {
        int a = 3;
        int[] datos = {1, 2, 3};

        sumarCinco(a);                          // llamada 1
        System.out.println("a = " + a);

        int r = duplicar(a);                    // llamada 2
        System.out.println("a = " + a + ", r = " + r);

        sumarDiez(datos);                       // llamada 3
        System.out.println("datos[0] = " + datos[0]);
    }
}

/*
 * SALIDA PREDICHA (antes de ejecutar):
 *   Dentro de sumarCinco: i = 8
 *   a = 3
 *   a = 3, r = 6
 *   datos[0] = 11
 *
 * Razonamiento:
 *   - Llamada 1: n es una copia de a; cambia la copia y a sigue en 3.
 *   - Llamada 2: x es una copia de a; se duplica la copia y se devuelve 6,
 *     pero a sigue en 3.
 *   - Llamada 3: v apunta al mismo arreglo que datos, así que datos[0]
 *     pasa de 1 a 11.
 *
 * SALIDA REAL (al ejecutar):
 *   Dentro de sumarCinco: i = 8
 *   a = 3
 *   a = 3, r = 6
 *   datos[0] = 11
 *
 * La salida real coincide con la predicha.
 */
