package Proverki.FirstLecsion;

import java.util.Scanner;

public class Something {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area = 0.0;
        String figure = scanner.nextLine();

        if (figure.equals("square"))

    {
            double h = Double.parseDouble(scanner.nextLine());
            area = h * h;


        }else if(figure.equals("rectangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            area = a * b;


        }else if (figure.equals("circle")){
            double r = Double.parseDouble(scanner.nextLine());
            area = Math.PI * r * r;


        }else if (figure.equals("triangle")){
            double duljinaStrana = Double.parseDouble(scanner.nextLine());
            double duljinaVisochina = Double.parseDouble(scanner.nextLine());
            area = duljinaStrana * duljinaVisochina / 2;

        }
        System.out.printf("%.3f",area);

    }
}
