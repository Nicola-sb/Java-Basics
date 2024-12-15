package MoreDifficultProverki;

import java.util.Scanner;

public class WorkingTime2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeoOftheDay = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();


        if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Friday") || dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday") ||
                dayOfWeek.equals("Saturday")){
            if(timeoOftheDay > 10 && timeoOftheDay < 18){
                System.out.println("open");
            }
        }else if (dayOfWeek.equals("Sunday")) {
            System.out.println("closed");
        }
    }
}
