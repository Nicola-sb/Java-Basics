package AloneProverki;

import java.util.Scanner;

public class AdventureAlone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        double price = 0;
        String type = "";

        if(budget<=100){
            destination = "Bulgaria";
            System.out.printf("Somewhere in %s%n",destination);
            if(season.equals("summer")){
                price = budget * 0.30;
                type = "Camp";

            }else if(season.equals("winter")){
                price = budget * 0.70;
                type = "Hotel";

            }

        }else if ( budget <= 1000){
            destination = "Balkans";
            System.out.printf("Somewhere in %s%n",destination);
            if(season.equals("summer")){
                price = budget * 0.40;
                type = "Camp";

            }else if(season.equals("winter")){
                price = budget * 0.80;
                type = "Hotel";

            }


        }else if(budget > 1000){
            destination = "Europe";
            System.out.printf("Somewhere in %s%n",destination);

            price = budget * 0.90;
            type = "Hotel";


        }

        System.out.printf("%s - %.2f%n",type,price);


    }
}
