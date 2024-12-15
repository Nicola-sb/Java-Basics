package AloneProverki;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int numberOfNights = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0;
        double apartamentPrice = 0;

        switch (month) {
            case "May":
            case "October":
                studioPrice = numberOfNights * 50;
                apartamentPrice = numberOfNights * 65;
                if (numberOfNights > 14 ){
                    studioPrice=studioPrice * 0.70;
                    apartamentPrice = apartamentPrice * 0.90;

                }else if(numberOfNights > 7 )
                    studioPrice = studioPrice * 0.95;

                break;
            case "June":
            case "September":
                studioPrice = numberOfNights * 75.20;
                apartamentPrice = numberOfNights * 68.70;
                if(numberOfNights > 14){
                    studioPrice = studioPrice * 0.80;
                    apartamentPrice = apartamentPrice * 0.90;
                }
                break;
            case "July":
            case "August":
                studioPrice = numberOfNights * 76;
                apartamentPrice = numberOfNights * 77;
                if (numberOfNights > 14){
                    apartamentPrice = apartamentPrice * 0.90;
                }
        }


             System.out.printf("Apartment: %.2f lv.%n",apartamentPrice);
             System.out.printf("Studio: %.2f lv.",studioPrice);



    }
}
