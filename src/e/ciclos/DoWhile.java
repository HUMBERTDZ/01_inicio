package e.ciclos;

public class DoWhile {

    public static void main(String[] args) {
        //Los ciclos permiten repetir una serie de instrucciones cierta cantidad de veces
        //para ver mas a detalle el funcionamiento de los ciclos:
        //seleccionamos la condicion >clic derecho >new watch >punto de ruptura >clic derecho >debug file
        //funciona igual que while pero siempre se ejecuta una sola vez
        //esto debido a que primero hace una ejecucion del codigo y posteriormente evalua la condicion
        int contador = 0;
        do {
            System.out.println("contador usando do-while: " + contador);
            contador++;
        } while (contador < 3);

        System.out.println("Podemos seguir usando la variable contador ya que se declara fuera del ciclo: " + contador + "\n");

        int conta = 0;
        do {
            conta++;
            if (conta % 2 != 0) {
                continue;
            }
            System.out.println("soy un numero par: " + conta);
        } while (conta < 10);

        int num = 0;
        do {
            if (num == 7) {
                break;
            }
            System.out.println("numero: " + num);
            num++;
        } while (num < 10);
    }
}
