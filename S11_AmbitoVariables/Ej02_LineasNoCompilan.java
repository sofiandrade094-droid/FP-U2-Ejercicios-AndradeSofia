/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio 02: Líneas que no compilan
 * Enunciado: dejar comentadas con // las líneas con error, con el mensaje del compilador y la causa.
 * Autor: Andrade Sofia
 * Fecha: 19/11/2026
 */
public class Ej02_LineasNoCompilan {

    static int total = 0;

    static void metodo() {
        int local = 5;                     // local: solo existe dentro de metodo()
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            int dentro = i * 2;            // i y dentro: de bloque, solo existen dentro del for
        }

        // ERROR 1
        // System.out.println(i);
        // Mensaje: error: cannot find symbol (symbol: variable i)
        // Causa: i es variable de bloque del for; al cerrar el for ya no existe.

        // ERROR 2
        // System.out.println(dentro);
        // Mensaje: error: cannot find symbol (symbol: variable dentro)
        // Causa: dentro se declaró dentro de las llaves del for; afuera no se ve.

        metodo();

        // ERROR 3
        // System.out.println(local);
        // Mensaje: error: cannot find symbol (symbol: variable local)
        // Causa: local es variable local de metodo(); main no puede verla.

        int x = 1;

        // ERROR 4
        // int x = 2;
        // Mensaje: error: variable x is already defined in method main(String[])
        // Causa: no se puede declarar otra variable con el mismo nombre en el mismo ámbito.

        // ERROR 5
        // int y;
        // System.out.println(y);
        // Mensaje: error: variable y might not have been initialized
        // Causa: una variable local no tiene valor inicial; hay que asignarle uno antes de usarla.

        // Estas líneas sí compilan: total es static y x es local de main.
        total = total + x;
        System.out.println("total = " + total + ", x = " + x);
    }
}