package c.operadores;

public class Ternario {

    public static void main(String[] args) {
        //este operador se llama asi porque tiene 3 partes
        //simplifica la estructura if-else
        //Solo es recomendable en expresiones simples, si son expresiones mas complejas lo recomendable es usar la estructura if-else
        
        String resultado = (1 > 2) ? "Verdadero" : "Falso";
        System.out.println(resultado);

        System.out.println("");//salto de linea
        
        //Ejercicio 2
        var numero = 8;
        resultado = (numero % 2 == 0) ? "Es un numero par" : "Es un numero impar";
        System.out.println(resultado);
    }

}
