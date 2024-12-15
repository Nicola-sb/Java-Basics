import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        int lenght = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int high = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int volumeSM = lenght * width * high;

        double volumeDS = volumeSM / 1000.00;

        double needWater = volumeDS * (1 - percent / 100 );

        System.out.println(needWater);


    }
}
