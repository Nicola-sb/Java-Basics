package MoreDifficultProverki;

import java.util.Scanner;

public class NumberInRageAlone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        if ( num >= - 100 && num <= 100 && num !=0){
            System.out.println("Yes");
        }else if (num == 0){
            System.out.println("No");
        }


    }
}
