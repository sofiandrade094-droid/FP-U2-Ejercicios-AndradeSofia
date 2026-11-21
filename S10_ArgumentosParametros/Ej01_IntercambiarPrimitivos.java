/*
 * Sesión: S10 - Argumentos y parámetros: paso por valor
 * Ejercicio 01: Intercambiar dos primitivos
 * Enunciado: escribir intercambiar(int a, int b) e intentar intercambiar dos variables de main. ¿Funciona? Explicar.
 * Autor: Andrade Sofia
 * Fecha: 19/11/2026
 */
public class Ej01_IntercambiarPrimitivos {

    static void intercambiar(int a, int b) {
        int temporal = a;
        a = b;
        b = temporal;
        System.out.println("Dentro de intercambiar: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 9;

        System.out.println("Antes: x = " + x + ", y = " + y);
        intercambiar(x, y);
        System.out.println("Después: x = " + x + ", y = " + y);
    }
}

/*
 * ¿FUNCIONA? NO.
 *
 * ¿Por qué? Java pasa los argumentos por valor. Al llamar intercambiar(x, y),
 * se copian los valores 5 y 9 en los parámetros a y b, que son variables
 * locales del método y distintas de x e y.
 * Dentro del método a y b sí se intercambian (a = 9, b = 5), pero solo se
 * cambian las copias. Al terminar el método desaparecen y x e y siguen
 * valiendo 5 y 9.
 */