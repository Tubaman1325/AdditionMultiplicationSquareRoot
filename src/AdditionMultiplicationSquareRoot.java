import java.util.Scanner;
import java.lang.Math;


public class AdditionMultiplicationSquareRoot {

    //Eventually add code to the math methods that decipher whether or not the user input an integer.
    //If not, restart that method.

    public static void main(String[] args) {

        boolean restart = true;

        while (restart) {

            System.out.println("Choose select from the following list and input the corresponding number: ");
            System.out.println("Addition, enter 1");
            System.out.println("Multiplication enter 2");
            System.out.println("Square root, enter 3");

            Scanner mathSelection = new Scanner(System.in);
            int choice = mathSelection.nextInt();

            if (choice == 1) {
                addition();
            } else if (choice == 2) {
                multiplication();
            } else if (choice == 3) {
                squareRoot();
            } else {
                System.out.println("The entry is not a valid selection");
            }

            Scanner input = new Scanner(System.in);
            String answer;
            System.out.println("again? Y/N?");
            answer = input.nextLine();

            restart = answer.equalsIgnoreCase("y");
        }
    }

    private static void addition() {
        int number1;
        int number2;
        int sum;

        Scanner additionInput = new Scanner(System.in);
        System.out.println("Enter the first number you would like to add");
        number1 = additionInput.nextInt();
        System.out.println("Enter the next number you would like to add to your previous input");
        number2 = additionInput.nextInt();

        sum = number1 + number2;
        System.out.println("The sum of the two numbers is " + sum);
    }

    private static void multiplication() {
        int number1;
        int number2;
        int product;

        Scanner multiplicationInput = new Scanner(System.in);
        System.out.println("Enter the first number you would like to have multiplied");
        number1 = multiplicationInput.nextInt();
        System.out.println("Enter the next number you would like to multiply by the previous input");
        number2 = multiplicationInput.nextInt();

        product = number1 * number2;
        System.out.println("The product of those two numbers is " + product);
    }


    private static void squareRoot() {
        Scanner squareRootInput = new Scanner(System.in);
        int number;
        System.out.println("Enter a number in which you would like to find the square root");
        number = squareRootInput.nextInt();
        System.out.println("The square root of " + number + " is " + Math.sqrt(number));
    }
}


