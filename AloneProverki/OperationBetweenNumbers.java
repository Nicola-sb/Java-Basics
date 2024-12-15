package AloneProverki;

import java.util.Scanner;

public class OperationBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String symvol = scanner.nextLine();

        double result = 0;



        if (symvol.equals("+")){
            result = num1 + num2;
            if (result % 2 == 0){
                System.out.println("even");
            }else {
                System.out.println("odd");
            }
        }else if(symvol.equals("-")){
            result = num1 - num2;
            if (result % 2 == 0){
                System.out.println("even");
            }else {
                System.out.println("odd");
            }

        }else if(symvol.equals("*")){
            result = num1 * num2;
            if (result % 2 == 0){
                System.out.println("even");
            }else {
                System.out.println("odd");
            }

        }else if(symvol.equals("/")){
            result = num1 / num2;


        }else if(symvol.equals("%")){

        }
    }
}
