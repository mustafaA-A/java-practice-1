package Unit_02.Chapter_02.Q_02_02_01;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scannerO = new Scanner(System.in);
    int N;
    N = Integer.parseInt(scannerO.nextLine());
    if ((N % 3) == 0) {
        if ((N % 5) == 0) {
            System.out.println("Fizz Buzz");
        }
        else {
            System.out.println("Fizz");    
      }
    
    }
    else if ((N % 5) == 0) {
        if ((N % 5) == 3) {
            System.out.println("Fizz Buzz");
        }
        else {
            System.out.println("Buzz");
        }
    }
    else {
        System.out.println(N);
    }
    }
}
