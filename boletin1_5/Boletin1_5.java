
package boletin1_5;

import java.util.Scanner;


public class Boletin1_5 {

   
    public static void main(String[] args) {
        //pasar millas marinas a metros
         Scanner sc= new Scanner(System.in);
        System.out.println("millas: ");
        float millas= sc.nextFloat();
        System.out.println("Cambio: ");
        float cambio= sc.nextFloat();
        System.out.println( millas*cambio + " metros");
    }
    
}
