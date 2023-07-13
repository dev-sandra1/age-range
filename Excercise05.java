import java.util.Scanner;

public class Excercise05{
    public static void main(String[] args) {
        
    Scanner enter = new Scanner(System.in);

    int age;
    String name;

    System.out.print("enter your name: ");
    name = enter.nextLine();

    System.out.print("enter your age: ");
    age = enter.nextInt(); 

    
     if( age > 0 && age < 18 ) {

        System.out.println("hi " + name + "welcome to the movie THE LITTLE MERMAID since you are between 0 and 18 years old");
    } else if ( age >= 18 && age <=30 ){
        System.out.println("hi " + name + " welcome to the freddy fnaf movie since you are in a range between 18 and 30 years old");
     }else { System.out.println(" I'm sorry but can't watch any movies");
     }
 
    }
}