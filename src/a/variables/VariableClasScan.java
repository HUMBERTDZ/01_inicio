package a.variables;

import java.util.Scanner;//importamos la clase scanner

public class VariableClasScan {

    public static void main(String[] args) {
        //codigo duro, no pide ningun dato en consola, todo se asigna de manera directa en codigo:
        //var usuario = "Beto";
        //System.out.println("usuario = " + usuario);

        //uso de clase Scanner, manera dinamica
        /*
    boolean nextBoolean()
    Lee valores lógicos boléanos introducidos por el usuario.

    byte nextByte()
    Lee valores byte introducidos por el usuario.

    double nextDouble()
    Lee valores double introducidos por el usuario.

    float nextFloat()
    Lee valores float introducidos por el usuario.

    int nextInt()
    Lee valores int introducidos por el usuario.

    String nextLine()
    Lee valores String introducidos por el usuario.

    long nextLong()
    Lee valores long introducidos por el usuario.

    short nextShort()
    Lee valores short introducidos por el usuario.
         */
        
        //instancia de clase Scanner llamada consola
        Scanner consola = new Scanner(System.in);

        System.out.println("Ingresa tu nombre");
        var nombre = consola.nextLine();//hace una pausa y lo que reciba en consola de tipo String se lo agrega a la variable nombre

        System.out.println("Ingresa tu carrera: ");
        var carrera = consola.nextLine();//hace una pausa y lo que reciba en consola de tipo String se lo agrega a la variable carrera

        System.out.println("Ingresa tu semestre actual:");
        var semestre = consola.nextInt();//hace una pausa y lo que reciba en consola de tipo Int se lo agrega a la variable semestre

        consola.close();
        
        //imprime todos los valores introducidos
        System.out.println("Hola " + nombre + " tu carrera es " + carrera + " tu semestre actual es " + semestre + " semestre");
        
    }

}
