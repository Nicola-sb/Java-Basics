package SecondWeek;

import java.util.Scanner;

public class CalculatorDepozit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double depozit = Double.parseDouble(scanner.nextLine());
        int mounts = Integer.parseInt(scanner.nextLine());
        double procent = Double.parseDouble(scanner.nextLine());

        double sum = depozit + mounts * ( (depozit * procent / 100 ) / 12 );

        System.out.println(sum);


    }
}
