package c.operadores;

public class Asignacion {

    public static void main(String[] args) {
        //operador de asignacion, todo lo que este en el lado derecho, evalua de izquierda a derecha
        int a = 3, b = 2;
        int c = a + 5 - b;
        System.out.println("Valor de variable c: " + c);

        //operador de asignacion compuesto
        //operador compuesto de suma
        a += 1;
        System.out.println("Valor de a con composicion suma: " + a);//4

        a += 3;//se puede sumar x cantidad
        System.out.println("Valor de a con composicion suma: " + a);//7

        //operador compuesto resta
        a -= 2;
        System.out.println("Valor de a con composicion resta: " + a);//5

        //operador compuesto multiplicacion
        a *= 2;
        System.out.println("Valor de a con composicion multiplicacion: " + a);//10
        
        //operador compuesto division
        a /= 2;
        System.out.println("Valor de a con composicion division: " + a);//5
        
        //operador compuesto modulo
        a %= 2;
        System.out.println("Valor de a con composicion modulo: " + a);//1
    }
}
