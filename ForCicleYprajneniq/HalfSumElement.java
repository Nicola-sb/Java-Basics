package ForCicleYprajneniq;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int maxNumber = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0; i < n; i++){
            int number = Integer.parseInt(scanner.nextLine());
            sum = sum + number;

            if(number > maxNumber){
                maxNumber = number;
            }
        }
        int sumWithoutMaxSum = sum - maxNumber;
        if(maxNumber == sumWithoutMaxSum ){
            System.out.println("Yes");
            System.out.printf("Sum = %d",sumWithoutMaxSum);
        }else{
            System.out.println("No");
            System.out.printf("Diff = %d",Math.abs(sumWithoutMaxSum- maxNumber));

        }
    }
}
