package c.operadores;

public class IgualdadRelacionales {

    public static void main(String[] args) {
        //operador de igualdad == : sirve para preguntar si dos elementos son iguales
        var a = 3;
        var b = 2;
        var c = (a == b);//determina si "a" es exactamente igual a "b" y guarda el valor boolean
        System.out.println("El valor de c: " + c);//imprime el valor booleano

        //operador diferente de != : sirve para preguntar si un elemento es diferente de otro
        var d = (a != b);//determina si "a" es diferente de "b"
        System.out.println("El valor de d: " + d);//imprime el valor booleano

        //la igualdad no se usa igual cuando trabajamos con objetos
        var cadena = "Beto";
        var cadena2 = "BETO";
        //var e = (cadena == cadena2);//con esta operacion evalua la referencia al objeto, no el contenido

        var f = (cadena.equals(cadena2));//con esta operacion se compara si "cadena" tiene el mismo contenido que "cadena2"
        System.out.println("cadenas iguales: " + f);//imprime el valor booleano

        var g = (cadena.equalsIgnoreCase(cadena2));
        System.out.println("cadenas con mismas letras: " + g);
    }
}
