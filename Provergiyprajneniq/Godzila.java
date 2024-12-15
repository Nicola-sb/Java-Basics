package Provergiyprajneniq;

import java.util.Scanner;

public class Godzila {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numberPeople = Integer.parseInt(scanner.nextLine());
        double priceClothesOnePeople = Double.parseDouble(scanner.nextLine());

        double priceDecor = budget * 0.10;
        double priceForClotche = numberPeople * priceClothesOnePeople;

        if(numberPeople >= 150){
            priceClothesOnePeople = priceClothesOnePeople * 0.90;

        }


         double allFilmPrice = priceDecor + priceForClotche;
         double diff = Math.abs(allFilmPrice - budget);




        if (allFilmPrice > budget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",diff);

        }else{
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",diff);

        }
    }
}
