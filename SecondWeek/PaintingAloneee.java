package SecondWeek;

import java.util.Scanner;

public class PaintingAloneee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int razreditel = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());


        double priceNylon = (nylon + 2) * 1.50;
        double pricePaint = (paint * 1.10) * 14.50;
        double priceRazreditel = razreditel * 5;
        double torbichka = 0.40;

        double allPriceMaterials = priceNylon + pricePaint + priceRazreditel + torbichka;

        double priceForOneHourMaistors = hours * (allPriceMaterials * 0.30);

        double allSum = allPriceMaterials + priceForOneHourMaistors;

        System.out.println(allSum);

    }
}
