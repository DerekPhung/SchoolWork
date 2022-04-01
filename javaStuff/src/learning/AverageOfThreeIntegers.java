package learning;

import java.util.Scanner;

public class AverageOfThreeIntegers {
    Scanner input = new Scanner(System.in);

    public int realNum(){
        System.out.println("Enter a number:");

        String numberString = input.nextLine();
        
        try{
            int num = Integer.parseInt(numberString);
            return num;
        }
        catch(Exception e){
            System.out.println("That is not an integer, please enter an integer.");
            return realNum();
        }


    }

    public static void main(String[] args) {
        AverageOfThreeIntegers a = new AverageOfThreeIntegers();
        Scanner consoleInput = new Scanner(System.in);

        String numberString;

        int num1, num2, num3;
        num1 = a.realNum();
        num2 = a.realNum();
        num3 = a.realNum();



        int sum = num1 + num2 + num3;
        double average = (double) sum/3;

        System.out.println("The numbers are:");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        System.out.printf("The average is %.2f", average);
    }
}
