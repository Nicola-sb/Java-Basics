package HomeworkProverki;

import java.util.Scanner;

public class CatTom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int restDays = Integer.parseInt(scanner.nextLine());

//•	Когато е на работа, стопанинът му си играе с него по 63 минути на ден.
//•	Когато почива, стопанинът му си играе с него  по 127 минути на ден.

        double restDay = 20;
        double days1Year = 365;

        double workdaysInOneYear = days1Year - restDay;

        double worKdayOwnerPlayin = 63;
        double restDaysOwnerPlaying = 127;

        double restdaysPlayingMinutes = restDay * restDaysOwnerPlaying;
        double workingdaysPlayingMin = workdaysInOneYear * worKdayOwnerPlayin;




    }
}

