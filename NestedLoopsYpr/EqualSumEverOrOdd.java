package NestedLoopsYpr;

import java.util.Scanner;

public class EqualSumEverOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum=Integer.parseInt(scanner.nextLine());
        int secondNum=Integer.parseInt(scanner.nextLine());

        for(int i = firstNum;i<=secondNum;i++){
            int currentNum=i;
            int evenSum=0;
            int oddsum=0;

            for(int j=6;j>=1;j--){
                int digit = currentNum % 10;

                if(j % 2 ==0){
                    evenSum = evenSum + digit;
                }else{
                    oddsum = oddsum + digit;
                }
                currentNum = currentNum / 10;
            }
            if(oddsum==evenSum){
                System.out.print(i + " ");
            }
        }
    }
}
