package MoreDifficultProverki;

import java.util.Scanner;

public class SmallShopWithLogicalii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double kolichestvo = Double.parseDouble(scanner.nextLine());

        double priceOneproduct = 0;

        if (town.equals("Sofia") && product.equals("coffe")) {

            priceOneproduct = 0.50;
        }}}
