package SecondWeek;

import java.util.Scanner;

public class Literatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pages = Integer.parseInt(scanner.nextLine());
        int pagesForHour = Integer.parseInt(scanner.nextLine());
        int numberDays = Integer.parseInt(scanner.nextLine());

        int obshtoWreme = pages / pagesForHour;
        int HourForday = obshtoWreme / numberDays;

        System.out.println(HourForday);


    }
}
