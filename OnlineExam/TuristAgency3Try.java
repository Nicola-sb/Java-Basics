package OnlineExam;

import java.util.Scanner;

public class TuristAgency3Try {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String town = scanner.nextLine();
        String equipment = scanner.nextLine();
        String vipDisc = scanner.nextLine();
        int numberDays = Integer.parseInt(scanner.nextLine());

        double priceForOneDay = 0;
        boolean isTown = town.equals("Bansko") || town.equals("Borovets") || town.equals("Varna") || town.equals("Burgas");
        boolean isVipPaket = equipment.equals("noEquipment") || equipment.equals("withEquipment") || equipment.equals("noBreakfast") || equipment.equals("withBreakfast");
        boolean isValid = true;


        if (town.equals("Bansko")) {
            if (equipment.equals("withEquipment")) {
                priceForOneDay = 100;
                if (vipDisc.equals("yes")) {
                    priceForOneDay = priceForOneDay * 0.90;
                }
            } else if (equipment.equals("noEquipment")) {
                priceForOneDay = 80;
                if (vipDisc.equals("yes")) {
                    priceForOneDay = priceForOneDay * 0.95;
                }
            }else{
                isValid = false;
            }
        }else if(town.equals("Borovets")){
            if(equipment.equals("withEquipment")){
                priceForOneDay = 100;
                if(vipDisc.equals("yes")){
                    priceForOneDay = priceForOneDay * 0.90;
                }
            }else if(equipment.equals("noEquipment")){
                priceForOneDay = 80;
                if(vipDisc.equals("yes")){
                    priceForOneDay = priceForOneDay * 0.95;
                }
            }else{
                isValid = false;
            }
        }else if(town.equals("Varna")){
            if(equipment.equals("withBreakfast")){
                priceForOneDay = 130;
                if(vipDisc.equals("yes")){
                    priceForOneDay = priceForOneDay * 0.88;
                }
            }else if(equipment.equals("noBreakfast")){
                priceForOneDay = 100;
                if(vipDisc.equals("yes")){
                    priceForOneDay = priceForOneDay * 0.93;
                }
            }else{
                isValid = false;
            }
        }else if(town.equals("Burgas")){
            if(equipment.equals("withBreakfast")){
                priceForOneDay = 130;
                if(vipDisc.equals("yes")){
                    priceForOneDay = priceForOneDay * 0.88;
                }
            }else if(equipment.equals("noBreakfast")){
                priceForOneDay = 100;
                if(vipDisc.equals("yes")){
                    priceForOneDay = priceForOneDay * 0.93;
                }
            }else{
                isValid = false;
            }
        }else{
            isValid = false;
        }
        double allSum = numberDays * priceForOneDay;

        if (numberDays > 7) {
            allSum = allSum - priceForOneDay;
        }

        if (numberDays < 1) {
            System.out.println("Days must be positive number!");
        } else if (isValid) {
            System.out.printf("The price is %.2flv! Have a nice time!", allSum);
        } else {
            System.out.println("Invalid input!");
        }
    }
}
