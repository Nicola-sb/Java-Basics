package ExamPreparation;

import java.util.Scanner;

public class EasterEgs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberEgs = Integer.parseInt(scanner.nextLine());


        int countRedEggs = 0;
        int countOrangeEggs = 0;
        int countBlueEggs = 0;
        int countGreenEggs = 0;

        int counterMaxEggs = 0;
        String maxEggsColor = "";

        for (int i = 1; i <= numberEgs; i++) {
            String colorEggs = scanner.nextLine();

            if (colorEggs.equals("red")) {
                countRedEggs++;
                if (counterMaxEggs < countRedEggs) {
                    counterMaxEggs = countRedEggs;
                    maxEggsColor = "red";
                }
            } else if (colorEggs.equals("orange")) {
                countOrangeEggs++;
                if (counterMaxEggs < countOrangeEggs) {
                    counterMaxEggs = countOrangeEggs;
                    maxEggsColor = "orange";
                }
            } else if (colorEggs.equals("blue")) {
                countBlueEggs++;
                if (counterMaxEggs < countBlueEggs) {
                    counterMaxEggs = countBlueEggs;
                    maxEggsColor = "blue";
                }
            } else if (colorEggs.equals("green")) {
                countGreenEggs++;
                if (counterMaxEggs < countGreenEggs) {
                    counterMaxEggs = countGreenEggs;
                    maxEggsColor = "green";
                }

            }
        }



        System.out.printf("Red eggs: %d%n", countRedEggs);
        System.out.printf("Orange eggs: %d%n", countOrangeEggs);
        System.out.printf("Blue eggs: %d%n", countBlueEggs);
        System.out.printf("Green eggs: %d%n", countGreenEggs);
        System.out.printf("Max eggs: %d -> %s", counterMaxEggs, maxEggsColor);
    }
}