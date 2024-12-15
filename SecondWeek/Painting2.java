package SecondWeek;

import java.util.Scanner;

public class Painting2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int razr = Integer.parseInt(scanner.nextLine());
        int workHours = Integer.parseInt(scanner.nextLine());

        double nylonPrise = nylon + 2;
        double paintPrise = paint + (paint * 10 / 100.00);
         double totalPriseM = nylonPrise * 1.50 + paintPrise * 15.50 + razr * 5.00 + 0.40;
         System.out.println(totalPriseM);
    }
}
