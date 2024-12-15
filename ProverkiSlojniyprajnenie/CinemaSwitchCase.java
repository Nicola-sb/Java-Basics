package ProverkiSlojniyprajnenie;


import java.util.Scanner;

public class CinemaSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

         double priceTicket = 0;

        switch (projection){
            case "Premiere":
                priceTicket = 12;
                break;
            case "Normal":
                priceTicket = 7.5;
                break;
            case "Discount":
                priceTicket = 5;
                break;





        }
        int allSeats = columns * rows;
        double totalPrice = allSeats * priceTicket;
        System.out.printf("%.2f leva", totalPrice);

    }
}

