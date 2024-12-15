package AloneProverki;

import java.util.Scanner;

public class SkiVacantionAlone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String tipRoom = scanner.nextLine();
        String ocenka = scanner.nextLine();

        double roomForOne = 18 * days;
        double apartament = 25 * (days -1);
        double presidentApartament= 35 * days;

        double priceOneNight = 0;
        if(days < 10){
            priceOneNight = apartament * 0.70;
            presidentApartament = presidentApartament * 0.90;
        }else if(days > 10 && days <=15){
           priceOneNight = apartament * 0.65;
            presidentApartament= presidentApartament * 0.85;
        }else{
            priceOneNight = apartament * 0.50;
            priceOneNight = presidentApartament * 0.80;
        }

        if(ocenka.equals("positive")){
           priceOneNight = priceOneNight + (priceOneNight * 0.25);
        }else if(ocenka.equals("negative")){
           priceOneNight = priceOneNight - (priceOneNight * 0.10);
        }
      double allSum = days * priceOneNight;
        System.out.printf("%.2f",allSum);

    }
}
