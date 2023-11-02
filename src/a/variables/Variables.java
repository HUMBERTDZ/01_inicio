package a.variables;

//clase en JAVA
public class Variables {

    //metodo que inicia la ejecucion del programa
    public static void main(String[] args) {
        /*
        *Para definir una variable se usa la siguiente sintaxis:
        *tipo de dato/nombre/valor que contiene
         */

        //ENTEROS
        int varEntera = 10;//declaramos una variable de tipo entero
        System.out.println("valor de mi Variable: " + varEntera);//imprimimos en consola

        varEntera = 5;//modificamos el valor de la variable
        System.out.println("Nuevo valor de miVariable: " + varEntera);//imprimimos el nuevo valor

        System.out.println("");//salto de linea

        //CADENAS
        String miVariableCadena = "Humberto"; //String no es un tipo primitivo si no una clase en java
        System.out.println("Valor de miVariableCadena: " + miVariableCadena);

        miVariableCadena = "Humberto de la cruz ";//modificando el valor de la variable
        System.out.println("Nuevo valor de miVariableCadena: " + miVariableCadena);
        
        String cadenaA = new String("Hola soy una cadena que usa el constructos");
        System.out.println(cadenaA);

        //CADENA DIAMICA, dado que la clase String es invariante
        StringBuilder saludo = new StringBuilder();
        saludo.append("Hola");
        saludo.append(", ");
        saludo.append("adios");
        System.out.println(saludo);
        
        
        //VAR: INFERENCIA DE TIPOS
        //java infiere el tipo de dato, var solo se puede usar dentro de metodos
        var edad = 10;//java infiere que es un tipo entero
        var nombre = "Humberto";//java infiere que es un tipo cadena
        var casado = false;//java infiere que es un tipo boolean
        var inicial = 'H';//java infiere que es un tipo char
    }
}
