package c.operadores;

public class Unarios {

    public static void main(String[] args) {
        int a = 3;
        int b = -a;//operador unario de cambio de signo
        System.out.println("Valor de a: " + a);
        System.out.println("Valor de a con Operador unario de cambio de signo: " + b);
        
        boolean c = true;
        boolean d = !c;//operador unuario de negacion, solo aplica en valores booleanos
        System.out.println("Valor de variable c: " + c);
        System.out.println("Valor de c con operador unario de negacion: " + d);
        
        System.out.println("");
        
        //PREincremento
        //primero incrementa el valor antes de usarlo, PRE/antes
        int e = 3;
        int f = ++e;
        System.out.println("Valor de \"e\": " + e);//4
        System.out.println("Valor de \"e\" con preincremento: " + f);//4
        
        //POSTincremento
        //primero usa su valor y luego lo incrementa
        int g = 5;
        int h = g++;//aqui lee el valor de g y ya le queda un incremento pendiente a g
        System.out.println("Valor de \"g\" con postincremento: " + g);//aqui ya se aplica el incremento pendiente
        System.out.println("Valor de \"g\" normal: " + h);//aqui imprime su valor normal
        
        //PREdecremento
        int i = 2;
        var j = --i;
        System.out.println("Valor de \"i\": " + i);
        System.out.println("Valor de i con predecremento: " + i);
        
        //POSTdecremento
        int k = 8;
        int l = k--;//aqui se queda un decremento pendiente
        System.out.println("Valor de \"k\": con postdecremento: " + k);
        System.out.println("Valor de \"k\":" + l);
    }
}
