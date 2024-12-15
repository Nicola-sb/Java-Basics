package NestedLoopsYpr;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        boolean isValid=false;

        int currentNum=0;

        for (int rows = 1 ; rows <=n;rows++){
                for(int columns =1;columns<=rows;columns++){
                    currentNum++;

                    if(currentNum>n){
                        isValid=true;
                        break;
                    }
                    System.out.print(currentNum + " ");
                }
                if(isValid){
                    break;
                }
                System.out.println();
        }

    }
}
