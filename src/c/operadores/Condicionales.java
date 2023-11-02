package c.operadores;

public class Condicionales {

    public static void main(String[] args) {
        //and y or
        //evalua si a se encuentra entre un valor minimo con valor a 0 o un valor maximo definido en 10
        var a = 20;
        var valorMinimo = 0;
        var valorMaximo = 10;

        //AND: ambas sentencias deben de ser verdaderas, si una es falsa, toda la oracion es falsa
        var resultado2 = a >= valorMinimo && a <= valorMaximo;//Operador Y
        if (resultado2) {//en automatico la primera condicion es verdadera
            System.out.println("Dentro de rango");
        } else {
            System.out.println("Fuera de rango");
        }
        
        System.out.println("");//salto de linea
        
        //EVALUAR SI UN PADRE PUEDE IR AL JUEGO DE SU HIJO
        //OR: solo basta con que una oracion sea verdadera para ser toda verdadera
        var vacaciones = false;
        var diaDescanso = true;
        
        if (vacaciones || diaDescanso) {
            System.out.println("Puede asistir");
        }
        else{
            System.out.println("No puede asistir");
        }
    }
}
