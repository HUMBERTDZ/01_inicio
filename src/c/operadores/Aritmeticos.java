package c.operadores;

public class Aritmeticos {

    public static void main(String[] args) {
        int a = 3, b = 2;//declaramos dos variables en una sola linea

        //suma
        var resultado = a + b;//una variable entero con el resultado de suma
        System.out.println("resultado de suma: " + resultado);

        //resta modificando el valor de la var resultado
        resultado = a - b;
        System.out.println("resultado de la resta: " + resultado);

        //multiplicacion
        resultado = a * b;
        System.out.println("resultado de multiplicacion: " + resultado);

        //division
        double resultado2 = 3D / b;
        //no incluye el tipo flotante ya que al ser enteros, el resultado igualmente sera entero, es necesario modificar el valor de resultado
        System.out.println("resultado de la division " + resultado2);

        //operador de modulo
        resultado = a % b;
        System.out.println("resultado de modulo: " + resultado);

        //identificar un numero par o impar
        if (b % 2 == 0) {
            System.out.println("Es un numero par");
        } else {
            System.out.println("Es un numero impar");
        }
    }
}
