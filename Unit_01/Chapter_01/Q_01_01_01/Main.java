package Unit_01.Chapter_01.Q_01_01_01;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner scannerOBJ = new Scanner(System.in);
       System.out.println("what is your name?");
       String x = scannerOBJ.nextLine();
       System.out.println(String.format("Good evening, %s!", x));
    }
}
