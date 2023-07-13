import java.util.Scanner;

public class Excercise03 {
    public static void main(String[] args) {
        
        // declaracion
        int vector [] = new int[4];

        //asignacion (por teclado)
        Scanner keyboard = new Scanner (System.in);
       
        for (int i=0; i<vector.length; i++) {
         System.out.println("enter value for keyboard: ");
         vector [i] = keyboard.nextInt();


        }
            //recorido

            for (int i=0; i<vector.length; i++) {
            System.out.println("I'm in the index: " + i);
            System.out.println("I have saved a " + vector[i]);               
            System.out.println("--------------");

        
        }


    }
}
