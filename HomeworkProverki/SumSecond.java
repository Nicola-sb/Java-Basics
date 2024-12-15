package HomeworkProverki;

import java.util.Scanner;

public class SumSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeFirst = Integer.parseInt(scanner.nextLine());
        int timeSecond = Integer.parseInt(scanner.nextLine());
        int timeThird = Integer.parseInt(scanner.nextLine());

        int totalTimeSeconds = timeFirst + timeSecond + timeThird;

        int minutes = totalTimeSeconds / 60;
        int seconds = totalTimeSeconds % 60;



        System.out.printf("%d:0%d",minutes,seconds);





    }
}
