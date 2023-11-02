package c.operadores;

public class Relacionales {

    public static void main(String[] args) {
        //define 2 variables con inferencia de tipos
        var a = 3;
        var b = 2;
        //define si a es mayor o igual a b
        var g = a >= b;//mayor que > o mayor o igual >=
        System.out.println("valor de g: " + g);//imprime el valor booleano

        //evalua si una variable es par o impar
        if (b % 2 == 0) {//relacional de igualdad ==
            System.out.println("Numero par");
        } else {
            System.out.println("Numero impar");
        }
        
        System.out.println("");//salto de linea
        
        //define si una persona es mayor de edad o no
        var edad = 10;
        var adulto = 18;
        if (edad >= adulto) {
            System.out.println("Es mayor de edad");
        }
        else{
            System.out.println("Es menor de edad");
        }
    }
}
