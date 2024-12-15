package SecondWeek;

import java.util.Scanner;

public class Basketball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearTax = Integer.parseInt(scanner.nextLine());


        double priceShoes = yearTax * 0.60;
        double priceSuit = priceShoes * 0.80;
        double priceBall = priceSuit / 4;
        double priceAss = priceBall / 5;

        double allPrice = yearTax + priceShoes + priceSuit + priceBall + priceAss;


        System.out.println(allPrice);





    }
}
