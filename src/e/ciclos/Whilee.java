package e.ciclos;

public class Whilee {

    public static void main(String[] args) {
        //Los ciclos permiten repetir una serie de instrucciones cierta cantidad de veces
        //WHILE
        //para ver mas a detalle el funcionamiento de los ciclos:
        //seleccionamos la condicion >clic derecho >new watch >punto de ruptura >clic derecho >debug file

        int contador = 0;//esta variable se puede usar incluso despues de salir del ciclo
        while (contador < 3) {
            System.out.println("contador con while: " + contador);
            contador++;
        }
        System.out.println("Podemos seguir usando la variable contador ya que se declara fuera del ciclo: " + contador + "\n");

        //palabra reservada continue
        int conta = 0;
        while (conta < 10) {
            conta++;
            if (conta % 2 != 0) {
                continue;
            }
            System.out.println("numero par: " + conta);
        }
        
        //palabra reservada break
        int num = 0;
        while(num < 10){
            if (num == 7) {
                break;
            }
            System.out.println("numero: " + num);
            num ++;
        }
    }
}
