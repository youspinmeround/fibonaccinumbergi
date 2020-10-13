import java.io.IOException;
import java.util.Scanner;


public class MyClass{

    public static void main(String args[]){
        System.out.println("Hello! This program will show you the Fibonacci numbers.");
        System.out.println(" ");

        Scanner reader = new Scanner(System.in);
        System.out.println("How many numbers Fibonacci to show you? ");
        int howmuch = reader.nextInt();
        int fib1 = 1;
        int fib2 = 1;
        int i = 0;

        while (i < howmuch - 2){
            int fib_sum = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib_sum;
            i = i + 1;
            System.out.println(fib2);

        }
    }
}