package Homework;

import java.util.Scanner;

public class ZaProba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int evenSum=0;
        int oddSum=0;

        String input=scanner.nextLine();
        while (!input.equals("stop")){
            int currentNumber=Integer.parseInt(input);
            int countProsto=0;

            if(currentNumber<0){
                System.out.println("Number is negative.");
                input=scanner.nextLine();
                continue;
            }

            for(int i=1;i<=currentNumber;i++){
                if(currentNumber%i==0){
                    countProsto++;
                }
            }
            if(countProsto==2){
                evenSum=evenSum+currentNumber;
            }else{
                oddSum=oddSum+currentNumber;
            }


            input=scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d%n",evenSum);
        System.out.printf("Sum of all non prime numbers is: %d",oddSum);
    }
}
