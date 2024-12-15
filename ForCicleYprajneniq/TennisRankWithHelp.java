package ForCicleYprajneniq;

import java.util.Scanner;

public class TennisRankWithHelp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberTournaments = Integer.parseInt(scanner.nextLine());
        int points = Integer.parseInt(scanner.nextLine());

        int winCounts = 0;
        double pointsFromTour = 0;

        for(int i=1;i<=numberTournaments;i++){
            String stage = scanner.nextLine();
            switch (stage){
                case "W":
                    points = points + 2000;
                    pointsFromTour = pointsFromTour + 2000;
                    winCounts++;
                    break;
                case "F":
                    points = points + 1200;
                    pointsFromTour = pointsFromTour + 1200;
                    break;
                case "SF":
                    points = points + 720;
                    pointsFromTour = pointsFromTour + 720;
            }
        }

        double averagePoints = Math.floor(pointsFromTour / numberTournaments);
        double winProcent = (winCounts * 1.0/numberTournaments) * 100;


        System.out.printf("Final points: %d%n",points);
        System.out.printf("Average points: %.0f%n",averagePoints);
        System.out.printf("%.2f%%",winProcent);
    }
}
