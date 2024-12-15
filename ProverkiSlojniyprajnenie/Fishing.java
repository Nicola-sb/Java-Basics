package ProverkiSlojniyprajnenie;

import java.util.Scanner;

public class Fishing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int numberFishingMan = Integer.parseInt(scanner.nextLine());

        double priceForBoat = 0;



        if (season.equals("Spring")){
            priceForBoat = 3000;
            if (numberFishingMan <= 6){
                priceForBoat = priceForBoat * 0.90;
            }else if (numberFishingMan > 6 && numberFishingMan <=11){
                priceForBoat = priceForBoat * 0.85;
            }else if (numberFishingMan >=12){
                priceForBoat = priceForBoat * 0.75;
            }

        }else if (season.equals("Summer")){
            priceForBoat = 4200;


        }else if (season.equals("Autumn")){
            priceForBoat = 4200;


        }else if (season.equals("Winter")){
            priceForBoat = 2600;

        }
        double diff = Math.abs(priceForBoat - budget);

        if(budget > priceForBoat){
            System.out.printf("Yes! You have %.2f leva left.",diff);

        }else if(budget < priceForBoat){
            System.out.printf("Not enough money! You need %.2f leva.",diff);

        }
    }

}
