package b.tipos.primitivos;

public class Entero {

    public static void main(String[] args) {
        //tipos primitivos enteros: byte, short, int, long
        //debido a que los procesadores tienen una arquiterctura de 32 y 64 bits si queremos ahorrar la mayor cantidad de espacio en memoria posible
        //lo mas recomenbale es usar el tipo int

        byte numberByte = 10;//aunque es de tipo entero se puede asignar a un byte ya que byte tiene un rango
        System.out.println("Valor de numberByte = " + numberByte);
        System.out.println("Valor minimo del byte: " + Byte.MIN_VALUE);//imprime el valor minimo del byte
        System.out.println("Valor maximo del byte: " + Byte.MAX_VALUE);//imprime valor maximo

        System.out.println("");//salto de linea

        short numeroShort = 10;
        System.out.println("Valor de numeroShort: " + numeroShort);
        System.out.println("Valor minimo de Short: "  + Short.MIN_VALUE);//imprime el valor minimo de tipo short
        System.out.println("Valor maximo de Short: " + Short.MAX_VALUE);//valor maximo de tipo short
        
        
        System.out.println("");//salto de linea
        
        int numeroInt = 10;
        System.out.println("Valor de numeroInt: " + numeroInt);
        System.out.println("Valor minimo de int: " + Integer.MIN_VALUE);//imprime el valor minimo de tipo int
        System.out.println("Valor maximo de int: " + Integer.MAX_VALUE);//valor maximo de tipo int
        
        System.out.println("");//salto de linea
        
        long numeroLong = 10;
        System.out.println("Valor de numeroLong: " + numeroLong);
        System.out.println("Valor minimo de long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo de long: " + Long.MAX_VALUE);
    }
}
