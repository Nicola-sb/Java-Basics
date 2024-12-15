package AloneProverki;

import java.util.Scanner;

public class SkiVacantionAloneSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String tipRoom = scanner.nextLine();
        String ocenka = scanner.nextLine();

        double priceOneNight = 0;

        switch (tipRoom){
            case "room for one person":
                priceOneNight = 18 * days;
                break;
            case "apartment":
                priceOneNight = 25 * (days -1);
                if(days < 10){
                    priceOneNight = priceOneNight * 0.70;
                }else if(days >10 && days < 15){
                    priceOneNight = priceOneNight * 0.65;
                }else{
                    priceOneNight = priceOneNight * 0.50;
                }
                break;
            case "president apartment":
                priceOneNight = 35 * (days -1);
                if(days < 10){
                    priceOneNight = priceOneNight * 0.90;
                }else if(days >10 && days < 15){
                    priceOneNight = priceOneNight * 0.85;
                }else{
                    priceOneNight = priceOneNight * 0.80;
                }
                break;
        }

        if(ocenka.equals("positive")){
            priceOneNight = priceOneNight + (priceOneNight * 0.25);
        }else if(ocenka.equals("negative")){
            priceOneNight = priceOneNight - (priceOneNight * 0.10);
        }

        System.out.printf("%.2f",priceOneNight);
    }
}
