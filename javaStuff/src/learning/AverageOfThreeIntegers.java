package learning;

import java.util.Scanner;

public class AverageOfThreeIntegers {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);

        String numberString;

        int num1, num2, num3;
        num1 = 0;
        num2 = 0;
        num3 = 0;

        while(true){
        System.out.println("Enter number 1:");
        numberString = consoleInput.nextLine();
            try{
                num1 = Integer.parseInt(numberString);
                break;
            }
            catch(Exception ex){
                System.err.println("That is not an integer, please enter an integer.");
            }
        }

        while(true) {
            System.out.println("Enter number 2:");
            numberString = consoleInput.nextLine();
            try {
                num2 = Integer.parseInt(numberString);
                break;
            } catch (Exception ex) {
                System.err.println("That is not an integer, please enter an integer.");
            }
        }

        while(true) {
            System.out.println("Enter number 3:");
            numberString = consoleInput.nextLine();
            try {
                num3 = Integer.parseInt(numberString);
                break;
            } catch (Exception ex) {
                System.err.println("That is not an integer, please enter an integer.");
            }
        }

        int sum = num1 + num2 + num3;
        double average = (double) sum/3;

        System.out.println("The numbers are:");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        System.out.printf("The average is %.2f", average);
    }
}
