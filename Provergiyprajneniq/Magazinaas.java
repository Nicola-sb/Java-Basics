package Provergiyprajneniq;

import java.util.Scanner;

public class Magazinaas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceTrip = Double.parseDouble(scanner.nextLine());
        int numberPuzzle = Integer.parseInt(scanner.nextLine());
        int numberCycles = Integer.parseInt(scanner.nextLine());
        int numberteddyBears = Integer.parseInt(scanner.nextLine());
        int numberMinions = Integer.parseInt(scanner.nextLine());
        int numberTrucks = Integer.parseInt(scanner.nextLine());

        double allSum = numberPuzzle * 2.60 + numberCycles * 3 + numberteddyBears * 4.10 + numberMinions * 8.20 + numberTrucks * 2;
        int allToys = numberPuzzle + numberCycles + numberteddyBears + numberMinions + numberTrucks;

        if (allToys >= 50) {
            allSum = allSum - (allSum * 0.25);
        }
            allSum = allSum * 0.90;

            double diff = Math.abs(allSum - priceTrip);

            if (allSum >= priceTrip){
                System.out.printf("Yes! %.2f lv left.",diff);

            }else{
                System.out.printf("Not enough money! %.2f lv needed.",diff);

            }

        }

    }

