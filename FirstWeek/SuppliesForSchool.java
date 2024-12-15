import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        //• Пакет химикали - 5.80 лв.
        //
        //• Пакет маркери - 7.20 лв.
        //
        //• Препарат - 1.20 лв (за литър)
        //whod : broi himikalki, broi markeri, litri preparat, namalenie
        //obstho pari za himikalki : br. himikalki * 5.80
        //obshto pari za markeri : br markeri * 7.20
        //obshto pari za preparat : litri preparat *1.20
        //obsthto pari za knijarnicata,kato smetnem i namelenieto na Ani

        int pens = Integer.parseInt(scanner.nextLine());

        int markers = Integer.parseInt(scanner.nextLine());

        int cleaner = Integer.parseInt(scanner.nextLine());

        int disc = Integer.parseInt(scanner.nextLine());

        double pensPrise = pens * 5.80;

        double markersPrise = markers * 7.20;

        double cleanerPrice = cleaner * 1.20;

        double totalPrice = pensPrise + markersPrise + cleanerPrice;

        double totalPriceAfterDisc = totalPrice - (totalPrice * disc / 100);

        System.out.println(totalPriceAfterDisc);



    }
}
