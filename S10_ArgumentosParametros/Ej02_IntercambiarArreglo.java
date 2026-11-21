/*
 * Sesión: S10 - Argumentos y parámetros: paso por valor
 * Ejercicio 02: Intercambiar dos posiciones de un arreglo
 * Enunciado: escribir intercambiar(int[] v, int i, int j) que intercambie dos posiciones del arreglo. ¿Ahora sí?
 * Autor: Andrade Sofia
 * Fecha: 19/11/2026
 */
public class Ej02_IntercambiarArreglo {

    static void intercambiar(int[] v, int i, int j) {
        int temporal = v[i];
        v[i] = v[j];
        v[j] = temporal;
    }

    static void mostrar(int[] v) {
        for (int k = 0; k < v.length; k++) {
            System.out.print(v[k] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40};

        System.out.print("Antes: ");
        mostrar(numeros);
        intercambiar(numeros, 0, 3);
        System.out.print("Después: ");
        mostrar(numeros);
    }
}

/*
 * ¿AHORA SÍ FUNCIONA? SÍ.
 *
 * ¿Por qué? Java sigue pasando por valor, pero lo que se copia es la
 * referencia (la dirección) del arreglo, no el arreglo completo. El
 * parámetro v apunta al mismo arreglo que numeros en main.
 * Cuando el método cambia v[i] y v[j], modifica el arreglo original, y ese
 * cambio se queda aunque el método termine.
 * Diferencia con el Ej01: allí se copiaba un número y no se podía llegar a
 * la variable original; aquí se copia la dirección y sí se puede.
 */