import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int x = 0;

        while (x == 0) {

            Scanner input = new Scanner(System.in);

            System.out.println("Welcome to the worst calculator ever! Please input a number");
            int firstNumber = input.nextInt();

            System.out.println("Please input an arithmetic operator");
            String operator = input.next();

            System.out.println("Please input another number");
            int secondNumber = input.nextInt();

            if (operator.contains("+")) {

                int answer = firstNumber + secondNumber;
                System.out.println("Your answer is " + answer);

            } else if (operator.contains("-")) {

                int answer = firstNumber - secondNumber;
                System.out.println("Your answer is " + answer);

            } else if (operator.contains("*")) {

                int answer = firstNumber * secondNumber;
                System.out.println("Your answer is " + answer);

            } else if (operator.contains("/")) {

                int answer = firstNumber / secondNumber;
                System.out.println("Your answer is " + answer);

            } else {

                System.out.println("You dun goofed!");
            }

        }

    }
}
