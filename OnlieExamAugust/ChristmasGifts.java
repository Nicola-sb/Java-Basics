package OnlieExamAugust;

import java.util.Scanner;

public class ChristmasGifts {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String input = scanner.nextLine();
        int countChildren=0;
        int countToy=0;
        int countWuzrastni=0;
        int countPylower=0;
        int priceForOneToy=5;
        int priceForOnePylower=15;

        while (!input.equals("Christmas")){
            int age = Integer.parseInt(input);

            if(age <=16){
                countChildren++;
                countToy++;
            }else{
                countWuzrastni++;
                countPylower++;
            }

            input=scanner.nextLine();
        }
        int sumAllToys=priceForOneToy * countChildren;
        int sumAllPylower=priceForOnePylower * countWuzrastni;
        System.out.printf("Number of adults: %d%n",countWuzrastni);
        System.out.printf("Number of kids: %d%n",countChildren);
        System.out.printf("Money for toys: %d%n",sumAllToys);
        System.out.printf("Money for sweaters: %d",sumAllPylower);
    }
}
