package b.tipos.primitivos;

public class Caracter {
    public static void main(String[] args) {
        //caracter o char solo almacena un caracter entre comilla simple
        //caracteres unicode https://en.wikipedia.org/wiki/List_of_Unicode_characters
        
        char miCaracter = 'H';
        System.out.println("Valor de miCaracter: " + miCaracter);
        
        System.out.println("");//salto de linea
        
        //con u indicamos que usaremos un caracter unicode
        char miChar = '\u0023';
        System.out.println("Mi Caracter con unicode es: " + miChar);
        
        //tambien se puede utilizar el codigo decimal asociado
        char michar2 = 35;
        System.out.println("Mi Caracter con decimal es: " + michar2);
        
        //tambien se puede utilizar directamente el caracter
        char michar3 = '#';
        System.out.println("Mi Caracter directo es: " + michar3);
    }
}
