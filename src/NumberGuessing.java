import java.util.Scanner;

public class NumberGuessing {



    public static void main (String[]args){

        //Declare
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        int randomNumber = (int)(Math.random()*100);
        int userNumber;


        //Ask
        System.out.println("Hello, there! Let's play a guessing game . . . ");
        System.out.println("Guess a whole number between 0 and 100.");
        userNumber = keyboard.nextInt();

    }
}

