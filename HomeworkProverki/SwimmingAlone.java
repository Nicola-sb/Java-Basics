package HomeworkProverki;

import java.util.Scanner;

public class SwimmingAlone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double seconds = Double.parseDouble(scanner.nextLine());
        double metres = Double.parseDouble(scanner.nextLine());
        double metresForSecondsFor1metre = Double.parseDouble(scanner.nextLine());

        double allMetres = metres * metresForSecondsFor1metre;

        double every15metres = Math.floor(metres / 15) * 12.5;

        double allTime = allMetres + every15metres;

        if (allTime > seconds) {
            System.out.printf("Yes, he succeeded! The new world record is %f seconds.",allTime);

        }else {
            System.out.printf("No, he failed! He was %.2f seconds slower.",allTime - seconds);

        }
    }
}
