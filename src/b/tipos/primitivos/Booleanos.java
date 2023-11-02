package b.tipos.primitivos;

public class Booleanos {
    public static void main(String[] args) {
        //boolean solo almacena true o false
        boolean varBoolean = true;//asigno un valor en mi variable
        System.out.println("Valor de varBoolean: " + varBoolean);
        
        if (varBoolean) {//en automatico un if en su inicio es verdadero
            System.out.println("La variable contiene un verdadero");
        }
        else{
            System.out.println("La variable contiene un falso");
        }
        
        System.out.println("");//salto de linea
        
        //definimos uns variable con la edad de 30
        var edad = 30;
        //difinimos una variable (booleana) que contiene si la edad es mayor o igual a 18
        var adulto = edad>= 18;
        
        //if, por defecto el primer valor es true
        if (adulto) {
            System.out.println("Eres un adulto");
        }
        else{
            System.out.println("Eres menor de edad");
        }
    }
    
}
