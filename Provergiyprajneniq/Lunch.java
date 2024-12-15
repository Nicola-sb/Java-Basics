package Provergiyprajneniq;

import java.util.Locale;
import java.util.Scanner;

public class Lunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String serial = scanner.nextLine();
        int episodeTime = Integer.parseInt(scanner.nextLine());
        int timeRest = Integer.parseInt(scanner.nextLine());

        double timeForLunch = timeRest * 1/8.0;
        double timeForRest = timeRest * 1 /4.0;

        double timeLeft = timeRest - timeForLunch - timeForRest;

        double diff =Math.abs(timeLeft - episodeTime) ;


        if (timeLeft >= episodeTime){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",serial ,Math.ceil(diff));

        }else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",serial,Math.ceil(diff));

        }



    }
}
