package MoreDifficultProverki;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double kolichestvo = Double.parseDouble(scanner.nextLine());

        double priceOneProduct = 0.0;


        if (town.equals("Sofia")) {
            if (product.equals("coffee")){
                priceOneProduct = 0.50;

            }else if(product.equals("water")){
                priceOneProduct = 0.80;

            }else if(product.equals("beer")){
                priceOneProduct = 1.20;
            }else if(product.equals("sweets")){
                priceOneProduct = 1.45;
            }else if(product.equals("peanuts")){
                priceOneProduct = 1.60;
            }

        }else if(town.equals("Plovdiv")){
            if (product.equals("coffee")){
                priceOneProduct = 0.40;
            }else if(product.equals("water")){
                priceOneProduct = 0.70;
            }else if(product.equals("beer")){
                priceOneProduct = 1.15;
            }else if(product.equals("sweets")){
                priceOneProduct = 1.30;
            }else if(product.equals("peanuts")){
                priceOneProduct = 1.50;
            }

        }else if(town.equals("Varna")){
            if (product.equals("coffee")){
                priceOneProduct = 0.45;
            }else if(product.equals("water")){
                priceOneProduct = 0.70;
            }else if(product.equals("beer")){
                priceOneProduct = 1.10;
            }else if(product.equals("sweets")){
                priceOneProduct = 1.35;
            }else if(product.equals("peanuts")){
                priceOneProduct = 1.55;
            }

        }
        double totalPrise = kolichestvo * priceOneProduct;
        System.out.println(totalPrise);
    }

}