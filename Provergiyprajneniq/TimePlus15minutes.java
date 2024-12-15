package Provergiyprajneniq;

import java.util.Scanner;

public class TimePlus15minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine()); //1
        int minutes = Integer.parseInt(scanner.nextLine()); //46

        int allMinutes = (hours * 60) + minutes + 15;

        int newHour = allMinutes / 60;
        int newMinutes = allMinutes % 60;

        if (newHour > 23){
            newHour = 0;
        }

        System.out.printf("%d:%02d",newHour,newMinutes);







    }
}
