package b.tipos.primitivos;

public class Inferencia {

    public static void main(String[] args) {
        /*
        Para ver a detalle los tipos hay un modo que se llama Modo Debugging
        1.- crear un punto de ruptura: clic sobre el numero de linea (area izquierda)
        2.- clic derecho debug file
        3.- si ventana Variables no esta visible: Window> Debugging> Variables
         */
        
        var numeroEntero = 10;//java infiere que el tipo es entero
        System.out.println("Valor de numeroEntero: " + numeroEntero);

        var numeroDouble = 10.0;//Java infiere que el tipo es Double
        System.out.println("Valor de numeroDouble: " + numeroDouble);

        var numeroFloat = 10.0F;//Java infiere que es de tipo Double, por lo que se le infica que es de tipo Float con la letra F al final
        System.out.println("Valor de numeroFloat: " + numeroFloat);
    }
}
