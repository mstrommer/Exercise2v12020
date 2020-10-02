package at.ac.fhcampuswien;

import java.util.Locale;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        // input your solution here
        double input;
        double max = 0;
        int count = 1;

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);  //enable us float input; ex: 2.2

        do {
            //Todo remove println for successful tests
            System.out.print("Number " + count + ": ");

            if (scan.hasNextDouble()) {         //check if is valid double
                input = scan.nextDouble();

                if(input > max){
                    max = input;
                }
                count++;
            } else {
                input = 0;
            }

        } while (input > 0);

        if(max <= 0){
            System.out.println("No number entered.");
        } else {
            System.out.println("The largest number is " + String.format(Locale.US,"%.2f", max));
        }
    }

    //todo Task 2
    public void stairs(){
        // input your solution here
        Scanner scan = new Scanner(System.in);

        System.out.print("n: ");

        int input = scan.nextInt();
        int count = 1;

        if(input > 0){
            for (int i = 0; i < input; i++){
                for (int j = 0; j <= i; j++){
                    System.out.print(count + " ");
                    count++;
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid number!");
        }
    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
        final int rows = 6;
        for (int row = 1; row <= rows; row++){
            for (int col = rows; col > row; col--) {
                System.out.print(" ");
            }
            for (int col = 0; col < row*2-1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
    }

    //todo Task 5
    public void marks(){
        // input your solution here
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}