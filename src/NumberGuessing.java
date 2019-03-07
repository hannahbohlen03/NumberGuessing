import java.util.Scanner;

public class NumberGuessing {


    public static void main(String[] args) {

        //Declare
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100);
        int userNumber;


        //Ask
        System.out.println("Hello, there! Let's play a guessing game . . . ");
        System.out.println("Guess a whole number between 0 and 100.");
        userNumber = keyboard.nextInt();


        while(userNumber!=randomNumber){
            if(userNumber>randomNumber){
              System.out.println("Too high! Try again.");
              userNumber=keyboard.nextInt();
            }
            else if (userNumber<randomNumber){
                System.out.println("Too low! Try again");
                userNumber=keyboard.nextInt();
            }
        }


        System.out.println(" ");
        System.out.println("Congratulations, you chose the correct number!");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Just so you know this ran correctly, your number was " +userNumber + " and the randomly generated " +
                "number was " + randomNumber + ".");
    }
}