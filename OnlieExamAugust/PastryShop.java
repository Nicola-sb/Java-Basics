package OnlieExamAugust;

import java.util.Scanner;

public class PastryShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sladkish=scanner.nextLine();
        int broiSladkishi=Integer.parseInt(scanner.nextLine());
        int dayOfMonthDecember=Integer.parseInt(scanner.nextLine());

        double priceForOnePiece=0;

        switch (sladkish){
            case "Cake":
                if(dayOfMonthDecember <=15){
                    priceForOnePiece=24;
                }else{
                    priceForOnePiece=28.70;
                }
                break;
            case "Souffle":
                if(dayOfMonthDecember <=15){
                    priceForOnePiece=6.66;
                }else{
                    priceForOnePiece=9.80;
                }
                break;
            case "Baklava":
                if(dayOfMonthDecember <=15){
                    priceForOnePiece=12.60;
                }else{
                    priceForOnePiece=16.98;
                }
                break;
        }
        double allSum=broiSladkishi * priceForOnePiece;



        if(dayOfMonthDecember <=22){
            if(allSum >=100 && allSum <=200){
                allSum=allSum * 0.85;
            }else if(allSum > 200){
                allSum=allSum * 0.75;
            }else if(dayOfMonthDecember<=15){
                allSum=allSum * 0.90;

            }
        }
        if(dayOfMonthDecember<=15){
            allSum=allSum * 0.90;
        }

        System.out.printf("%.2f",allSum);

    }
}
