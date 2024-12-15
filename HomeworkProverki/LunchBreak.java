package HomeworkProverki;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String film = scanner.nextLine();
        int episodeTime = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());

       double lucnhTime = breakTime / 8.0;
       double timeForRest = breakTime / 4.0;

       double leftTime = breakTime - lucnhTime - timeForRest;


       double diff = Math.abs(leftTime - episodeTime);

       if (leftTime >= episodeTime) {
           System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",film,Math.ceil(diff));


       }else {
           System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",film,Math.ceil(diff));

       }




    }
}
