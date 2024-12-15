package AloneProverki;

import java.util.Scanner;

public class OnTimeForExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int examOur = Integer.parseInt(scanner.nextLine());
        int examMin = Integer.parseInt(scanner.nextLine());
        int ourArrival = Integer.parseInt(scanner.nextLine());
        int minArrival = Integer.parseInt(scanner.nextLine());

        int examAllMin = examOur * 60 + examMin;
        int arrivalAllMin = ourArrival * 60 + minArrival;

        int diff = Math.abs(examAllMin - arrivalAllMin);
        int diffHour = diff / 60;
        int diffMin = diff % 60;


        if (examAllMin < arrivalAllMin){
            System.out.println("Late");
            if(diffHour == 0){
            System.out.printf("%d minutes after the start",diff);
        }else {
                System.out.printf("%d:%02d hours after the start",diffHour,diffMin);
            }

            }else if(examAllMin == examMin || diff <= 30){
            System.out.println("On time");
            System.out.printf("%d minutes before the start",diff);

        }else if(examAllMin > arrivalAllMin && diff >=30){
            System.out.println("Early");
            System.out.printf("%d:%02d hours before the start",diffHour,diffMin);
        }





    }
}
