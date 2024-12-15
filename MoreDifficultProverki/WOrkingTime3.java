package MoreDifficultProverki;

import java.util.Scanner;

public class WOrkingTime3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeoOftheDay = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();

        if (timeoOftheDay > 10 && timeoOftheDay < 18){
            if (dayOfWeek.equals("Monday")|| (dayOfWeek.equals("Tuesday")|| dayOfWeek.equals("Wednesday")||
                    dayOfWeek.equals("Thursday")|| dayOfWeek.equals("Friday")|| dayOfWeek.equals("Saturday"))){
                System.out.println("open");

            }
        }else{
            System.out.println("closed");
        }
    }

}
