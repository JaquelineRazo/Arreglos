import java.util.Scanner;

// Problema de Arreglos

public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        try (Scanner in = new Scanner( System.in )) {
            // Arreglo de 10 caracteres
            char arreglo[] = {'*','#','#','#','#','#','#','#','#','#'};
            int ind = 0;


 
            while( true ){

                System.out.println("\n");
                System.out.print(" Arreglo   \n");
                System.out.println("-----------");
                System.out.println(arreglo);
                System.out.println("-----------");
                System.out.println("\n");
 
                System.out.print("Ingresa un numero: \n");
                System.out.print(" Si es positivo * se mueve a la derecha \n Si es negativo * se mueve a la izquierda \n Si es 0 finaliza el programa\n");
                System.out.print(" -> ");
                int numero = in.nextInt();
 
                if( numero == 0 ){
                    break;
                }
 
                if( numero > 0 ){
                    if( ind == 9 ){
                        throw new Exception("Movimiento invalido, * fuera del arreglo");
                    }
 
                    arreglo[ind] = '#';
                    arreglo[++ind] = '*';
                }
                else{
                    if( ind == 0 ){
                        throw new Exception("Movimiento invalido, * fuera del arreglo");
                    }
 
                    arreglo[ind] = '#';
                    arreglo[--ind] = '*';
                }
            }
        }
        
        System.out.println("Programa Finalizado");
    }
 
}