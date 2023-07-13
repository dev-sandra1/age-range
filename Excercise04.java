import java.util.Scanner;

public class Excercise04 {
    public static void main(String[] args) {
        
        Scanner entry = new Scanner(System.in);

        int[] box = new int[]{3, 4, 5, 7, 8, 9, 3, 4, 5};


        /* box [0]=2;
        box [1]=35;
        box [2]=41;
        box [3]=17;
        box [4]=3; */
/* 
        for (int i=0; i < box.length; i++) { 
        System.out.println( i + ".objeto: " +  box[i]); 

        } */

        String names[] = new String[]{"name", "anna", "lila", "conejo", "lulu", "cangrejo"};

        for(int i=0; i < names.length; i++){
            System.out.println("El gato numero: " + i + " se llama: " + names[i]);
        }

    }
}
