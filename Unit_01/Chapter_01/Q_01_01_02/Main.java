package Unit_01.Chapter_01.Q_01_01_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float H = Float.parseFloat(scan.nextLine());
        float W = Float.parseFloat(scan.nextLine());        
        float A = (H * W);
        System.out.println(A);
    }
}
