package MoreDifficultProverki;

import java.util.Scanner;

public class OnTimeForExamAlone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMin = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMin = Integer.parseInt(scanner.nextLine());

        int examAllTime = (examHour * 60) + examMin;
        int arrivalAllTime = (arrivalHour * 60) + arrivalMin;

        int diff = Math.abs(examAllTime - arrivalAllTime);


        if(arrivalAllTime > examAllTime){
            System.out.println("Late");
            if(diff > 59) {
                int hour = diff / 60;
                int min = diff % 60;
                System.out.printf("%d:%02d hours after the start", hour, min);
            }else{
                System.out.printf("%d minutes after the start",diff);
            }
        }else if(arrivalAllTime == examAllTime || diff <= 30){
            System.out.println("On time");
            System.out.printf("%d minutes before the start",diff);
        }else {
            System.out.println("Early");
            int hour = diff / 60;
            int min = diff % 60;
            if (diff > 59) {
                System.out.printf("%d:%02d hours before the start", hour, min);

            } else {
                System.out.printf("%d minutes before the start",min);}
        }

    }
}
