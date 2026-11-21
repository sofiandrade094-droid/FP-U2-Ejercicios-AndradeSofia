/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio 03: Traza de un contador static llamado desde un for
 * Enunciado: programa con un contador static llamado desde un for y la tabla línea | variables vivas | valor.
 * Autor: Andrade Sofia
 * Fecha: 19/11/2026
 */
public class Ej03_TrazaContadorStatic {

    static int contador = 0;

    static void incrementar(int paso) {
        contador = contador + paso;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            incrementar(i);
            System.out.println("i = " + i + ", contador = " + contador);
        }
        System.out.println("Contador final = " + contador);
    }
}

/*
 * TRAZA (números de línea de este archivo)
 *
 * línea | variables vivas     | valor
 * ------+---------------------+---------------------------------------------
 *  10   | contador            | contador = 0 (se crea al cargar la clase)
 *  16   | contador, args      | empieza main
 *  17   | contador, args, i   | i = 1 (1 <= 3 es verdadero)
 *  18   | contador, args, i   | se llama incrementar(1)
 *  12   | contador, paso      | paso = 1
 *  13   | contador, paso      | contador = 0 + 1 = 1
 *  14   | contador, args, i   | paso desaparece; contador = 1
 *  19   | contador, args, i   | imprime "i = 1, contador = 1"
 *  17   | contador, args, i   | i = 2 (2 <= 3 es verdadero)
 *  18   | contador, args, i   | se llama incrementar(2)
 *  13   | contador, paso      | paso = 2; contador = 1 + 2 = 3
 *  19   | contador, args, i   | imprime "i = 2, contador = 3"
 *  17   | contador, args, i   | i = 3 (3 <= 3 es verdadero)
 *  18   | contador, args, i   | se llama incrementar(3)
 *  13   | contador, paso      | paso = 3; contador = 3 + 3 = 6
 *  19   | contador, args, i   | imprime "i = 3, contador = 6"
 *  17   | contador, args      | i = 4, 4 <= 3 es falso; el for termina y i desaparece
 *  21   | contador, args      | imprime "Contador final = 6"
 *
 * Idea clave: contador es static, por eso conserva su valor entre llamadas
 * (0, 1, 3, 6). Las variables paso e i nacen y mueren.
 */