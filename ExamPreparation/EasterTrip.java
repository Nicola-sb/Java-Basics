package ExamPreparation;

import java.util.Scanner;

public class EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String destination=scanner.nextLine();
        String dates=scanner.nextLine();
        int numberNights=Integer.parseInt(scanner.nextLine());

        double priceForOneNight=0;


        switch (destination){
            case "France":
                if(dates.equals("21-23")){
                    priceForOneNight=30;
                }else if(dates.equals("24-27")){
                    priceForOneNight=35;
                }else if(dates.equals("28-31")){
                    priceForOneNight=40;
                }
                break;
            case "Italy":
                if(dates.equals("21-23")){
                    priceForOneNight=28;
                }else if(dates.equals("24-27")){
                    priceForOneNight= 32;
                }else if(dates.equals("28-31")){
                    priceForOneNight= 39;
                }
                break;
            case "Germany":
                if(dates.equals("21-23")){
                    priceForOneNight= 32;
                }else if(dates.equals("24-27")){
                    priceForOneNight=37;
                 }else if(dates.equals("28-31")){
                    priceForOneNight= 43;
            }
                break;
        }

        double allRazhodi=(numberNights * 1.0) * priceForOneNight;

        System.out.printf("Easter trip to %s : %.2f leva.",destination,allRazhodi);



    }
}
