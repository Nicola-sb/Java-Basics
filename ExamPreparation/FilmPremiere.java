package ExamPreparation;

import java.util.Scanner;

public class FilmPremiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeForPic=Integer.parseInt(scanner.nextLine());
        int numberSceni=Integer.parseInt(scanner.nextLine());
        int timeScena=Integer.parseInt(scanner.nextLine());

        double preparationTeren= timeForPic * 0.15;
        double allTimeSceni=numberSceni * timeScena;
        double allNeeededTime = preparationTeren + allTimeSceni;

        double diff=Math.abs(timeForPic - allNeeededTime);

        if(timeForPic>allNeeededTime){
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!",diff);
        }else{
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.",diff);
        }
    }
}
