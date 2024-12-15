import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //вход найлон , боя, разредител , часове за работа
        //Предпазен найлон - 1.50 лв. за кв. метър
        //
        //· Боя - 14.50 лв. за литър
        //
        //· Разредител за боя - 5.00 лв. за литър

        // боя + 10%
        // найлон + 2кв м
        //торбички за боклук 0.40
        //пари за майстор = 30% от разходите
        //изход всички разходи = найлон,боя,торбички,разредител,майстори

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int workHours = Integer.parseInt(scanner.nextLine());

        double totalPaint = paint + (paint * 10 /100.00);
        int totalNylon = nylon + 2;

        double totalPriseM = totalNylon * 1.50 + totalPaint * 14.50 + thinner * 5.00 + 0.40;
        double workmanMoney = (totalPriseM * 30 / 100) * workHours;

        double totalPrise = totalPriseM + workmanMoney;

        System.out.println(totalPrise);





    }
}
