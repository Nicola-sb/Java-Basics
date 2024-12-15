package MoreDifficultProverki;

import java.util.Scanner;

public class Alonnee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourExam = Integer.parseInt(scanner.nextLine());
        int minExam = Integer.parseInt(scanner.nextLine());
        int arrivalHourTime = Integer.parseInt(scanner.nextLine());
        int minArrivalTime = Integer.parseInt(scanner.nextLine());

        double totalAllMinutes = (arrivalHourTime * 60) + minArrivalTime;

        double allArrivalHour = totalAllMinutes / 60;
        double allArrivalMin = totalAllMinutes % 60;

        if(hourExam < totalAllMinutes) {
            System.out.println("Late");
        }else if(hourExam == totalAllMinutes && totalAllMinutes < 30){
            System.out.println("On time");
        }


    }
}
