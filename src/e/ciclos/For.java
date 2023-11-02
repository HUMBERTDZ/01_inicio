package e.ciclos;

public class For {
    
    public static void main(String[] args) {
        //Los ciclos permiten repetir una serie de instrucciones cierta cantidad de veces
        //para ver mas a detalle el funcionamiento de los ciclos:
        //seleccionamos la condicion >clic derecho >new watch >punto de ruptura >clic derecho >debug file

        //en el caso del ciclo for, la variable se declara dentro del mismo ciclo
        //for(inicio; final; incremento)
        //orden dentro del for: for(1; 3; 2;) primero hace el aumento y luego corrobora que sea menor a 11
        for (int i = 0; i < 10; i++) {
            System.out.println("contador usando for: " + i);
        }
        
        System.out.println("");//salto de linea

//        for (int i = 0; i < 11; i++) {
//            System.out.println("4 x " + i + " = " + (4 * i));
//        }
        for (int i = 0; i < 10; i++) {
            if (i == 7){
                break;
            }
            System.out.println("numero: " + i);
        }
        
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                continue;//sigue a la siguiente iteracion
            }
            System.out.println("Soy un numero par: " + i);
        }

        //System.out.println("NO podemos seguir usando la variable contador ya que se declaro dentro del ciclo y es una variable local: " + i);
    }
    
}
