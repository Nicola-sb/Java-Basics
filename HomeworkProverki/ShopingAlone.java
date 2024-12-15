package HomeworkProverki;

import java.util.Scanner;

public class ShopingAlone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videocards = Integer.parseInt(scanner.nextLine());
        int procesors = Integer.parseInt(scanner.nextLine());
        int rams = Integer.parseInt(scanner.nextLine());

        double priceVideo = videocards * 250;
        double priceProcesors = priceVideo * 0.35;
        double priceRam = priceVideo * 0.10 * rams;

        double allSum = priceVideo + priceProcesors + priceRam;

        if(videocards > procesors){
            allSum = allSum * 0.85;
        }

        double diff = Math.abs(budget -allSum);

        if(budget > allSum){
            System.out.printf("You have %.2f leva left!",diff);
        }else{
            System.out.printf("Not enough money! You need %.2f leva more!",diff);
        }



    }
}
