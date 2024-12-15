package SecondWeek;

import java.util.Scanner;

public class SchoolMaterials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int preparat = Integer.parseInt(scanner.nextLine());
        int procentNamalenie = Integer.parseInt(scanner.nextLine());

        double pensPrice = pens * 5.80;
        double markersPrice = markers * 7.20;
        double preparatPrice = preparat * 1.20;
        double Allproduct = pensPrice + markersPrice + preparatPrice;
    }
}
