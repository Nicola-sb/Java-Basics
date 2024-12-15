package ProverkiSlojniyprajnenie;

import java.util.Scanner;

public class FishingSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int numberFishingMan = Integer.parseInt(scanner.nextLine());

        double priceForBoat = 0;



        switch (season){
            case "Spring":
                priceForBoat = 3000;
                break;
            case "Summer":
            case "Autumn":
                priceForBoat = 4200;
                break;
            case "Winter":
                priceForBoat = 2600;
                break;


        }

        if (numberFishingMan <=6 ){
            priceForBoat = priceForBoat * 0.90;
        }else if( numberFishingMan <=11){
            priceForBoat = priceForBoat * 0.85;

        }else{
            priceForBoat = priceForBoat * 0.75;

        }


        if (numberFishingMan % 2 ==0 && !season.equals("Autumn")){
            priceForBoat = priceForBoat * 0.95;




        }
        double diff =Math.abs(budget - priceForBoat);

        if (priceForBoat <= budget){
            System.out.printf("Yes! You have %.2f leva left.",diff);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.",diff);

        }
    }
}
