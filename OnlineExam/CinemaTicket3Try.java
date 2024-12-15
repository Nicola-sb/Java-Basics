package OnlineExam;

import java.util.Scanner;

public class CinemaTicket3Try {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String movie=scanner.nextLine();
        int totalTickets=0;
        int studentTickets=0;
        int standardTickets=0;
        int kidTickets=0;

        while (!movie.equals("Finish")){
            int freePlaces=Integer.parseInt(scanner.nextLine());
            String ticketType=scanner.nextLine();
            int soldedTickets=0;

            while (!ticketType.equals("End")){

                soldedTickets++;
                switch (ticketType){
                    case "student":
                        studentTickets++;
                        break;
                    case "standard":
                        standardTickets++;
                        break;
                    case "kid":
                        kidTickets++;
                        break;
                }
                if(soldedTickets==freePlaces){
                    break;
                }

                ticketType=scanner.nextLine();
            }
            totalTickets+=soldedTickets;

            System.out.printf("%s - %.2f%% full.%n",movie,soldedTickets * 1.0 /freePlaces * 100);
            movie=scanner.nextLine();
        }

          System.out.printf("Total tickets: %d%n",totalTickets);
          System.out.printf("%.2f%% student tickets.%n",studentTickets * 1.0 / totalTickets * 100);
          System.out.printf("%.2f%% standard tickets.%n",standardTickets * 1.0 / totalTickets * 100);
          System.out.printf("%.2f%% kids tickets.",kidTickets * 1.0 / totalTickets * 100);


    }
}
