package SecondWeek;

import java.util.Scanner;

public class banicaaa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String figure = scanner.nextLine();
        double size = 0;



        if(figure.equals("square")){
            double a = Double.parseDouble(scanner.nextLine());
            size = a * a;

        }else if(figure.equals("rectangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            size = a * b;

        }else if(figure.equals("circle")){
            double r = Double.parseDouble(scanner.nextLine());
            size = Math.PI * r * r;

        }else if(figure.equals("triangle")){
            double b = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
             size = b * h / 2;
        }
        System.out.printf("%.3f",size);

    }
}
