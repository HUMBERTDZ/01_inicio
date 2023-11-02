package b.tipos.primitivos;

public class Conversion {

    public static void main(String[] args) {
        //conversion o casteo

        //convertir un tipo String a tipo int
        //Accedemos al metodo pasrseInt que esta en la clase Integer
        var edad = Integer.parseInt("20");
        System.out.println("Edad: " + (edad + 1));//imprime un valor entero

        //de int a string
        var numero = String.valueOf(20);
        System.out.println("Edad: " + (numero + 1));//imprime un String
        
        //de String a Double
        var valorPi = Double.parseDouble("3.1416");
        System.out.println("Valor de valorPi: " + (valorPi + 1));//imprime un tipo Double
        
        //de Double a String
        var valorPi2 = String.valueOf(3.1416);
        System.out.println("Valor de valorPi2: " + (valorPi2 + 1));//imprime un valor String
    }
}
