package HomeworkProverki;

import java.util.Scanner;

public class TimePlus15minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalTimeMinutes = hours * 60 + minutes + 15;

        int hourFirst = totalTimeMinutes / 60;
        int minutesFirst = totalTimeMinutes % 60;

        if (hourFirst > 23){
            hourFirst=0;




        }
        System.out.printf("%d:%02d",hourFirst,minutesFirst);

        }
}

