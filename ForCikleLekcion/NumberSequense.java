package ForCikleLekcion;

import java.util.Scanner;

public class NumberSequense {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++){
            int number = Integer.parseInt(scanner.nextLine());
            if (maxNumber < number){
                maxNumber = number;
            }
            if (minNumber > number){
                minNumber=number;
            }


        }
        System.out.printf("Max number: %d%nMin number: %d",maxNumber,minNumber);
    }
}
