package OnlineExam;

import java.util.Scanner;

public class TursitSecondTry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        String equipment = scanner.nextLine();
        String vipDisc = scanner.nextLine();
        int numberDays = Integer.parseInt(scanner.nextLine());

        boolean isValid = true;
        double priceForOneday = 0;
        double vipDiscWithProccent = 0;

        if(town.equals("Bansko")){
            if(equipment.equals("withEquipment")){
                priceForOneday = 100;
                vipDiscWithProccent = priceForOneday;
            }else if(equipment.equals("noEquipment")){
                priceForOneday =80;
                vipDiscWithProccent = priceForOneday * 0.95;
            }else{
                isValid = false;
            }


        }else if(town.equals("Borovets")){
            if(equipment.equals("withEquipment")){
                priceForOneday = 100;
                vipDiscWithProccent = priceForOneday;
            }else if(equipment.equals("noEquipment")){
                priceForOneday =80;
                vipDiscWithProccent = priceForOneday * 0.95;
            }else{
                isValid = false;
            }

        }else if(town.equals("Varna")){
            if(equipment.equals("withBreakfast")){
                priceForOneday = 130;
                vipDiscWithProccent = priceForOneday * 0.88;
            }else if(equipment.equals("noBreakfast")){
                priceForOneday = 100;
                vipDiscWithProccent = priceForOneday * 0.93;
            }else{
                isValid = false;
            }


        }else if(town.equals("Burgas")){
            if(equipment.equals("withBreakfast")){
                priceForOneday = 130;
                vipDiscWithProccent = priceForOneday * 0.88;
            }else if(equipment.equals("noBreakfast")){
                priceForOneday = 100;
                vipDiscWithProccent = priceForOneday;
            }else{
                isValid = false;
            }

        }else{
            isValid = false;
        }

        double allSum = numberDays * vipDiscWithProccent;

        if(numberDays >= 1 || town.equals("Bansko") || town.equals("Borovets") || town.equals("Varna")|| town.equals("Burgas") ){
            System.out.printf("The price is %.2flv! Have a nice time!",allSum);
        }else if ( numberDays < 1 && !isValid){
            System.out.println("Invalid input!");
        }



    }
}
