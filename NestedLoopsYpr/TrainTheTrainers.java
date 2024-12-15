package NestedLoopsYpr;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum=Integer.parseInt(scanner.nextLine());
        int secondNum=Integer.parseInt(scanner.nextLine());


//            1000000
//            1000050
        for(int i =firstNum;i<=secondNum;i++){
            int evenSum=0;
            int oddSum=0;
            int currenNum=i;
            for(int j=6;j>=1;j--){
                int digit = currenNum % 10;

                if(j % 2==0){
                    evenSum=evenSum+digit;
                }else{
                    oddSum=oddSum+digit;
                }

                currenNum=currenNum / 10;
            }

            if(evenSum==oddSum){
                System.out.print(i + " ");
            }
        }
        }
}
