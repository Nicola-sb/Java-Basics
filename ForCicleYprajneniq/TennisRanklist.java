package ForCicleYprajneniq;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberTournaments = Integer.parseInt(scanner.nextLine());
        int startNumberPointRank = Integer.parseInt(scanner.nextLine());

        double allPoints = 0;
        int winTours = 0;

        for(int i = 1;i<=numberTournaments;i++){
            String tournamentRank = scanner.nextLine();

            switch (tournamentRank){
                case "W":

                    allPoints = allPoints + 2000;
                    winTours++;

                    break;
                case "F":

                    allPoints = allPoints + 1200;

                    break;
                case "SF":
                    
                    allPoints = allPoints + 720;


                    break;
            }
        }

        double averragePoint=Math.floor(allPoints / numberTournaments);


        System.out.printf("Final points: %f%n",allPoints);
        System.out.printf("Average points: %.0f ",averragePoint);

    }
}
