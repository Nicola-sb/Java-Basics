package MoreDifficultProverki;

import java.util.Scanner;

public class TicketForCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayOfWeek = scanner.nextLine();

        switch (dayOfWeek){
            case "Monday":
            case "Tuesday":
            case "Friday":
                System.out.println("12");
                break;
            case "Wednesday":
            case "Thurdsay":
                System.out.println("14");
            case "Saturday":
            case "Sunday":
                System.out.println("16");

        }



    }
}
