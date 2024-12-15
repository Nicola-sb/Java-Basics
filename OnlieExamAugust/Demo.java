package OnlieExamAugust;

        import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String sladkish = scanner.nextLine();
        int numberSladkishi=Integer.parseInt(scanner.nextLine());
        int dayOfDecember=Integer.parseInt(scanner.nextLine());

        double priceForOneProduct=0;

        if(dayOfDecember<=15){
            switch (sladkish){
                case "Cake":
                    priceForOneProduct=24;
                    break;
                case "Souffle":
                    priceForOneProduct=6.66;
                    break;
                case "Baklava":
                    priceForOneProduct=12.60;
                    break;
            }
        }else{
            switch (sladkish){
                case "Cake":
                    priceForOneProduct=28.70;
                    break;
                case "Souffle":
                    priceForOneProduct=9.80;
                    break;
                case "Baklava":
                    priceForOneProduct=16.98;
                    break;
            }
        }
        double allSum=numberSladkishi * priceForOneProduct;

        if(dayOfDecember<=22) {
            if (allSum >= 100 && allSum <= 200) {
                allSum = allSum * 0.85;
            } else if (allSum > 200) {
                allSum = allSum * 0.75;
            }


        }

        System.out.printf("%.2f",allSum);
    }
}
