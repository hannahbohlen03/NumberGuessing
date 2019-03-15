import java.util.Scanner;

public class NumberGuessing {


    public static void main(String[] args) {

        //Declare Some Stuff
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100);
        System.out.println(randomNumber);
        int userNumber;
        int attempts = 9;


        //Ask User
        System.out.println("Hello, there! Let's play a guessing game . . . ");
        System.out.println("Guess a whole number between 0 and 100. You only have " +attempts+" tries.");
        userNumber = keyboard.nextInt();


        //Actual Loops Portions
        while(userNumber!=randomNumber && attempts>0){
            if(userNumber>randomNumber){
                System.out.println("Too high! You have" + attempts + " tries left.");


            }
            else if (userNumber<randomNumber) {
                System.out.println("Too low! You have " + attempts + " tries left.");

            }
            userNumber = keyboard.nextInt();
            attempts--;
        }


        if (attempts == 0){
            System.out.println("Sorry, you ran out of tries!");
            if(userNumber==randomNumber){
                System.out.println("However, you got it just in the nick of time.");
            }
        }
        else{
            System.out.println("Good job, you picked the correct number and you had " + attempts + " tries left too!");
            System.out.println("    ");
            System.out.println("Just so you know this ran correctly, your number was " + userNumber + " and the random ");
            System.out.println("number was " + randomNumber + ".");
        }

    }
}