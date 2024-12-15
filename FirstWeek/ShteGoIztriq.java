import java.util.Scanner;

public class ShteGoIztriq {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double usd = Double.parseDouble(scanner.nextLine());

        double bgn = usd * 1.45059;

        System.out.println(bgn);

    }
}
