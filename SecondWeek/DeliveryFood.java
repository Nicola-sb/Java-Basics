package SecondWeek;

import java.util.Scanner;

public class DeliveryFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegetarian = Integer.parseInt(scanner.nextLine());

        double chickenPrice = chicken * 10.35;
        double fishPrice = fish * 12.40;
        double vegetarianPrice = vegetarian * 8.15;

        double AllMenu = chickenPrice + fishPrice + vegetarianPrice;

        double desertPrice = AllMenu * 0.20;

        double totalPrice = AllMenu + desertPrice + 2.50;
        System.out.println(totalPrice);





    }
}