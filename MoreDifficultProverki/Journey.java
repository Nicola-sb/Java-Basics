package MoreDifficultProverki;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String placeForSleep = "";

        if(budget <= 100 ){
            destination = "Bulgaria";
            if(season.equals("summer")){
                budget = budget * 0.30;
            }else if(season.equals("winter")){
                budget = budget * 0.70;
            }
        }else if(budget <= 1000){
            destination = "Balkans";
            if(season.equals("summer")){
                budget = budget * 0.40;
            }else if(season.equals("winter")){
                budget = budget * 0.80;
            }

        }else if(budget > 1000){
            destination = "Europe";
            if(season.equals("summer")){
                budget = budget * 0.90;
            }else if(season.equals("winter")){
                budget = budget * 0.90;
            }

        }

        if(season.equals("summer")){
            placeForSleep = "Camp";

        }else if(season.equals("winter")){
            placeForSleep = "Hotel";
        }

        if(destination.equals("Europe")){
            placeForSleep = "Hotel";
        }

        System.out.printf("Somewhere in %s%n",destination);
        System.out.printf("%s - %.2f",placeForSleep,budget);

    }
}

