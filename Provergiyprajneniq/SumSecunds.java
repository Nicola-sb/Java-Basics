package Provergiyprajneniq;

import java.util.Scanner;

public class SumSecunds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeFirst = Integer.parseInt(scanner.nextLine());
        int timeSecond = Integer.parseInt(scanner.nextLine());
        int timeThird = Integer.parseInt(scanner.nextLine());

        int allAtlets = timeFirst + timeSecond + timeThird;

        int mintues = allAtlets / 60;
        int seconds = allAtlets % 60;

        if (seconds < 10) {
            System.out.printf("%d : %02d", mintues , seconds);

        }else{
            System.out.printf("%d : %d", mintues, seconds);
        }




    }
}
