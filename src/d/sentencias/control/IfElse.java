package d.sentencias.control;

public class IfElse {
    
    public static void main(String[] args) {
        //Sentencia de control if-else
        //ejemplo1
        var condicion = true;
        
        if (condicion) {
            System.out.println("Condicion verdadera");
        } else {
            System.out.println("Condicion falsa");
        }//fin ejemplo1

        System.out.println("");//salto de linea

        //ejemplo2
        var numero = 7;
        var numeroTxt = "desconocido";
        
        if (numero == 1) {
            numeroTxt = "Uno";
        } else if (numero == 2) {
            numeroTxt = "Dos";
        } else if (numero == 3) {
            numeroTxt = "Tres";
        } else if (numero == 4) {
            numeroTxt = "Cuatro";
        }
        System.out.println("Numero: " + numeroTxt);
        //fin ejemplo2

        System.out.println("");//salto de linea

        //ejemplo 3: calcula estacion de año, se usa switch como arriba
        var mes = 1;
        var estacion = "Desconocida";
        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Verano";
        }
        else if (mes == 9 || mes == 10 || mes == 11 ) {
            estacion = "Otonio";
        }
        System.out.println("Estacion: " + estacion);
        //fin ejemplo3
    }
}
