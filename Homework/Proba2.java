package Homework;

import java.util.Scanner;

public class Proba2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int currentNum=0;
        boolean flag=false;

        for(int rows=1;rows<=n;rows++){
            for(int colum=1;colum<=rows;colum++){
                currentNum++;
                if(currentNum>n){
                    flag=true;
                    break;
                }
                System.out.print(currentNum + " ");
            }
            if(flag){
                break;
            }

            System.out.println();
        }
    }
}
