package SecondWeek;

import java.util.Scanner;

public class Painting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int naylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int razreditel = Integer.parseInt(scanner.nextLine());
        int hoursForWork = Integer.parseInt(scanner.nextLine());

        double naylonPrice = 1.50;
        double paintPrice = 14.50;
        double razreditelPrice = 5.00;
        double torbichki = 0.40;

        double sumPrice = naylonPrice + paintPrice + razreditelPrice + torbichki;


    }
}
