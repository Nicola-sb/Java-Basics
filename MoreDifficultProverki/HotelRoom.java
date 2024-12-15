package MoreDifficultProverki;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int numberNights = Integer.parseInt(scanner.nextLine());

        double priceStudio = 0;
        double priceApartament = 0;


        if(month.equals("May")|| month.equals("October")){
            priceStudio = 50;
            priceApartament = 65;
            if(numberNights > 7 && numberNights < 14){
                priceStudio = priceStudio * 0.95;
            }else if (numberNights >= 14){
                priceStudio = priceStudio * 0.70;
                priceApartament = priceApartament * 0.90;
            }
        }else if(month.equals("June")|| month.equals("September")){
            priceStudio = 75.20;
            priceApartament = 68.70;
            if(numberNights > 14){
                priceStudio = priceStudio * 0.80;
                priceApartament = priceApartament * 0.90;
            }
        }else if(month.equals("July") || month.equals("August")){
            priceStudio = 76;
            priceApartament = 77;
            if(numberNights > 14){
                priceApartament = priceApartament * 0.90;
            }
        }

        double allPrice = numberNights * priceApartament;
        double allPriceStudio = numberNights * priceStudio;

        System.out.printf("Apartment: %.2f lv.%n",allPrice);
        System.out.printf("Studio: %.2f lv.",allPriceStudio);

    }
}
