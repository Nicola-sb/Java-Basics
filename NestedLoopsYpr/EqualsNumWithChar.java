package NestedLoopsYpr;

import java.util.Scanner;

public class EqualsNumWithChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum=Integer.parseInt(scanner.nextLine());
        int secondNum=Integer.parseInt(scanner.nextLine());



        for(int i=firstNum;i<=secondNum;i++){
            String numberAsString = "" + i;

            int evenSum=0;
            int oddSum=0;
            for(int j=0;j<6;j++){
                 String digitAsString = "" + numberAsString.charAt(j);
                 int digit = Integer.parseInt(digitAsString);

                 if(j % 2 ==0){
                     evenSum=evenSum + digit;
                 }else{
                     oddSum=oddSum + digit;
                 }
            }

            if(evenSum==oddSum){
                System.out.print(numberAsString + " ");
            }

        }
    }
}
