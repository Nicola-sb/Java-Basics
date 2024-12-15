package NestedLoopsLek;

import java.util.Scanner;

public class SumOfTwoNumbersWithKaloyan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start =Integer.parseInt(scanner.nextLine());
        int end =Integer.parseInt(scanner.nextLine());
        int magicNumber =Integer.parseInt(scanner.nextLine());

        int counterValid=0;
        boolean isValid=false;

        for(int i=start;i<=end;i++){
            for(int j=start;j<=end;j++){
                counterValid++;
                if(i + j == magicNumber){
                    System.out.printf("Combination N:%d (%d + %d = %d)",counterValid,i,j,magicNumber);
                    isValid=true;
                    break;
                }
            }
            if(isValid){
                break;
            }


        }
        if(!isValid){
            System.out.printf("%d combinations - neither equals %d",counterValid,magicNumber);
        }
    }
}
