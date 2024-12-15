package ProverkiSlojniyprajnenie;

import java.util.Scanner;

public class CinemaSwitchCaseAlone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String premiere = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double priceOneTicket = 0;

        switch (premiere){
            case "Premiere":
                priceOneTicket = 12;
                break;
            case "Normal":
                priceOneTicket = 7.5;
                break;
            case "Discount":
                priceOneTicket = 5;

        }

        double allRows = rows * columns;
        double totalPrice = allRows * priceOneTicket;


        System.out.printf("%.2f leva",totalPrice);
    }
}
