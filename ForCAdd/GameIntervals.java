package ForCAdd;

import java.util.Scanner;

public class GameIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberMoves = Integer.parseInt(scanner.nextLine());

        double points0To10=0;
        double points10To19=0;
        double points20To29=0;
        double points30To39=0;
        double points40To49=0;
        double invalidNumber=0;
        double allSum = 0;
        double result =0;




        for(int i=0;i<numberMoves;i++){
            double numberInterval = Integer.parseInt(scanner.nextLine());
            allSum = allSum + numberInterval;



            if (numberInterval >=0 && numberInterval <=9){
                points0To10++;
                allSum = numberInterval * 0.20;
                result = result + allSum;


            }else if(numberInterval > 0 && numberInterval <=19){
                points10To19++;
                allSum = numberInterval * 0.30;
                result = result + allSum;


            }else if(numberInterval> 0 && numberInterval <= 29){
                points20To29++;
                allSum = numberInterval * 0.40;
                result = result + allSum;


            }else if(numberInterval > 0 && numberInterval <= 39){
                points30To39++;
                allSum =  50;
                result = result + allSum;


            }else if(numberInterval > 0  && numberInterval <=50){
                points40To49++;
                allSum = 100;
                result = result + allSum;

            }else {
                result = result / 2;
                invalidNumber++;
            }

        }
        System.out.printf("%.2f%n",result);
        System.out.printf("From 0 to 9: %.2f%%%n",points0To10 / numberMoves * 100);
        System.out.printf("From 10 to 19: %.2f%%%n",points10To19 / numberMoves * 100);
        System.out.printf("From 20 to 29: %.2f%%%n",points20To29 / numberMoves * 100);
        System.out.printf("From 30 to 39: %.2f%%%n",points30To39 / numberMoves * 100);
        System.out.printf("From 40 to 49: %.2f%%%n",points40To49 / numberMoves * 100);
        System.out.printf("Invalid numbers: %.2f%%",invalidNumber / numberMoves * 100);
    }
}
