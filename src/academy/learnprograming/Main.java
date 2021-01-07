package academy.learnprograming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        double average = 0;
        while (true) {
            System.out.println("Please Enter Number");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                count++;
                sum += number;

            } else {
                System.out.println("Invalid Number");
                break;
            }


        }
        average = (double) Math.round(sum/count);
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
}
