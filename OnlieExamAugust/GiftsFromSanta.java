package OnlieExamAugust;

import java.util.Scanner;

public class GiftsFromSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N =Integer.parseInt(scanner.nextLine());
        int M =Integer.parseInt(scanner.nextLine());
        int S =Integer.parseInt(scanner.nextLine());

        for(int i=M;i>=N;i--){
            int currentNumber=i;

            if(currentNumber % 2 == 0 && currentNumber % 3 ==0){

                if(currentNumber==S){
                    break;
                }

                System.out.print(currentNumber + " ");

            }




        }
    }
}
