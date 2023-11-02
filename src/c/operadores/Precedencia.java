package c.operadores;

public class Precedencia {
    public static void main(String[] args) {
        //PRECEDENCIA: EL ORDEN EN QUE SE EVALUAN LAS OPERACIONES
        //https://lh5.googleusercontent.com/-RV4ZNzB5qvU/TeSJEIHEeSI/AAAAAAAAAJ0/-JVpFJBnxHs/CU00133A_1.png
        //las operaciones se analizan de izquierda a derecha
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        
        System.out.println("x = " + x);//6
        System.out.println("y = " + y);//9
        System.out.println("z = " + z);//16
        
        System.out.println("");//salto de linea
        
        //en caso que exista la misma prioridad: se evalua de izquierda a derecha
        var resultado = 4 + 5 * 6 / 3;
        System.out.println("resultado = " + resultado);
    }
}
