package b.tipos.primitivos;

public class Flotantes {

    public static void main(String[] args) {
        //tipos primitivos de tipo flotante: float y double
        //aquellos que tienen un punto decimal 
        
        float numeroFloat = 10.0F;
        System.out.println("Valor de numeroFloat: " + numeroFloat);
        System.out.println("Valor minimo de float: " + Float.MIN_VALUE);//imprime el valor minimo de tipo float
        System.out.println("Valor maximo de float: " + Float.MAX_VALUE);//valor maximo de tipo float
        
        System.out.println("");
        
        double numeroDouble = 10;
        System.out.println("Valor de numeroDouble: " + numeroDouble);
        System.out.println("Valor minimo de double: " + Double.MIN_VALUE);//imprime el valor minimo de double
        System.out.println("Valor maximo de double: " + Double.MAX_VALUE);//valor maximo de double
    }
}
