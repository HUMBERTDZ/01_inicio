package d.sentencias.control;

import java.util.Scanner;

public class Switchh {

    public static void main(String[] args) {
        //Switch se puede usar en menus, opcion 1, opcion 2, opcion etc.
        //donde existen multiples opciones
        
        Scanner dato = new Scanner(System.in);
        
        System.out.print("Ingresa un numero para escribirlo en texto: ");
        //ejemplo1, convierte el numero a texto
        var numero = dato.nextInt();
        var numeroTxt = "";

        numeroTxt = switch (numero) {
            case 1 -> "uno";
            case 2 -> "dos";
            case 3 -> "tres";
            case 4 -> "cuatro";
            default -> "desconocido";
        };
        System.out.println("Numero: " + numeroTxt);
        //fin de ejemplo 1
        
        System.out.println("");//salto de linea
        
        System.out.print("Ingresa un numero para encontrar la estacion del anio: ");
        //ejemplo 2: encuentra la estacion del anio
        var mes = dato.nextInt();
        var estacion = "";
        switch (mes) {
            case 1: case 2: case 12: 
                estacion = "invierno";
                break;
            case 3: case 4: case 5: 
                estacion = "primavera";
                break;
            case 6: case 7: case 8: 
                estacion = "Verano";
                break;
            case 9: case 10: case 11: 
                estacion = "Otonio";
                break;
            default:
                estacion = "desconocida";
        }
        System.out.println("Estacion: " + estacion);
    }

}
