import java.util.Scanner;

public class NumberGuessing {


    public static void main(String[] args) {

        //Declare Some Stuff
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100);
        int userNumber;
        int attempts = 10;


        //Ask User
        System.out.println("Hello, there! Let's play a guessing game . . . ");
        System.out.println("Guess a whole number between 0 and 100. You only have " +attempts+" tries.");
        userNumber = keyboard.nextInt();


        //Actual Loops Portions
        while(userNumber!=randomNumber && attempts>0){
            if(userNumber>randomNumber){
                System.out.println("Too high! Try again.");
                userNumber=keyboard.nextInt();
                attempts = attempts-1;

            }
            else if (userNumber<randomNumber) {
                System.out.println("Too low! Try again");
                userNumber = keyboard.nextInt();
                attempts = attempts - 1;
            }
            }

            if (attempts == 0){
                System.out.println("Sorry, you ran out of tries!");
            }
            else{
                System.out.println("Good job, you picked the correct number!");
                System.out.println("    ");
                System.out.println("Just so you know this ran correctly, your number was " +userNumber+ " and the random ");
                System.out.println("number was " +randomNumber+ ".");
            }

    }
}