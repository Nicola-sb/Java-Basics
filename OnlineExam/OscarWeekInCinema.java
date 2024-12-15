package OnlineExam;

import java.util.Scanner;

public class OscarWeekInCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filmName = scanner.nextLine();
        String hall = scanner.nextLine();
        int numberBillets = Integer.parseInt(scanner.nextLine());

        double priceOneTicket = 0;

        switch (filmName){
            case "A Star Is Born":
                if(hall.equals("normal")){
                    priceOneTicket = 7.50;
                }else if(hall.equals("luxury")){
                    priceOneTicket = 10.50;
                }else if(hall.equals("ultra luxury")){
                    priceOneTicket = 13.50;
                }
                break;
            case "Bohemian Rhapsody":
                if(hall.equals("normal")){
                    priceOneTicket = 7.35;
                }else if(hall.equals("luxury")){
                    priceOneTicket = 9.45;
                }else if(hall.equals("ultra luxury")){
                    priceOneTicket = 12.75;
                }
                break;
            case "Green Book":
                if(hall.equals("normal")){
                    priceOneTicket = 8.15;
                }else if(hall.equals("luxury")){
                    priceOneTicket = 10.25;
                }else if(hall.equals("ultra luxury")){
                    priceOneTicket = 13.25;
                }
                break;
            case "The Favourite":
                if(hall.equals("normal")){
                    priceOneTicket = 8.75;
                }else if(hall.equals("luxury")){
                    priceOneTicket = 11.55;
                }else if(hall.equals("ultra luxury")){
                    priceOneTicket = 13.95;
                }
                break;
        }

        double allSum = numberBillets * priceOneTicket;

        System.out.printf("%s -> %.2f lv.",filmName,allSum);
    }
}
