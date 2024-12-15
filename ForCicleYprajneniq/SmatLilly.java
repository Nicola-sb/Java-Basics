package ForCicleYprajneniq;

import java.util.Scanner;

public class SmatLilly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ageLilly = Integer.parseInt(scanner.nextLine());
        double washingMachine = Double.parseDouble(scanner.nextLine());
        int oneToyPrice = Integer.parseInt(scanner.nextLine());

        int countToys = 0;
        int money = 0;
        int allMoney = 0;
        int brotherCount = 0;

        for(int i = 1; i <= ageLilly; i++){
            if(i % 2 != 0){
                countToys++;

            }else{
                money = money + 10;
                allMoney = allMoney + money;

                brotherCount++;

            }
        }

        int totalSum = allMoney + (countToys * oneToyPrice) - brotherCount;

        double diff = Math.abs(totalSum - washingMachine);

        if(totalSum >= washingMachine){
            System.out.printf("Yes! %.2f",diff);
        }else{
            System.out.printf("No! %.2f",diff);

        }

    }
}
