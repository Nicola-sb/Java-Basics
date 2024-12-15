package Provergiyprajneniq;

import java.util.Scanner;

public class Shoping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budjetPetar = Double.parseDouble(scanner.nextLine());
        int numberVideocards = Integer.parseInt(scanner.nextLine());
        int numberProcesors = Integer.parseInt(scanner.nextLine());
        int numberRam = Integer.parseInt(scanner.nextLine());

        double sumVideocars = numberVideocards * 250;

        double priceProcesor = sumVideocars * 0.35 * numberProcesors;

        double priceRam = sumVideocars * 0.10 * numberRam;

        double allSum = sumVideocars + priceProcesor + priceRam;

        if (numberProcesors > numberProcesors){
            allSum = allSum - allSum * 0.15;

        }

        if (allSum <= budjetPetar){
            System.out.printf("You have %.2f leva left!", budjetPetar - allSum);
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!",allSum - budjetPetar);

        }



    }
}
