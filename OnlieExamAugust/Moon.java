package OnlieExamAugust;

import java.util.Scanner;

public class Moon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double averrageSpeed=Double.parseDouble(scanner.nextLine());
        double fuelLitter=Double.parseDouble(scanner.nextLine());

        double razstoqniedoLunata = 384400;

        double obshtoRazstoqnie = razstoqniedoLunata * 2;

        double timeGoingAndBack=Math.ceil(obshtoRazstoqnie/averrageSpeed);
        double allTime = timeGoingAndBack + 3;

        double finalFuel=(fuelLitter * obshtoRazstoqnie) / 100;

        System.out.printf("%.0f%n",allTime);
        System.out.printf("%.0f",finalFuel);



    }
}
