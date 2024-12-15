package MoreDifficultProverki;

import java.util.Scanner;

public class CinemaTicketAlone1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String premiere = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double priceOneTicket = 0;

        if(premiere.equals("Premiere")){
            priceOneTicket = 12;


        }else if(premiere.equals("Normal")){
            priceOneTicket = 7.5;


        }else if(premiere.equals("Discount")){
            priceOneTicket = 5;


        }

        double allRows = rows * columns;

        System.out.println(priceOneTicket * allRows);
    }
}
