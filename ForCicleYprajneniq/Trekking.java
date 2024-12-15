package ForCicleYprajneniq;

import java.util.Scanner;

public class Trekking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberGroupClimbers = Integer.parseInt(scanner.nextLine());

        int allpeople = 0;
        int peopleMysala =0;
        int peopleMonblan = 0;
        int peopleKilimandjaro = 0;
        int peopleK2 =0;
        int peopleEverst = 0;






        for(int i = 1;i<=numberGroupClimbers;i++){
            int number = Integer.parseInt(scanner.nextLine());
            allpeople = allpeople + number;


            if(number<=5){
                peopleMysala = peopleMysala + number;
            }else if(number<=12){
                peopleMonblan=peopleMonblan + number;
            }else if(number<=25){
                peopleKilimandjaro = peopleKilimandjaro + number;
            }else if(number<=40){
                 peopleK2 = peopleK2 + number;
            }else{
                  peopleEverst = peopleEverst + number;
            }
        }

        System.out.printf("%.2f%%%n",(peopleMysala * 1.0/allpeople) * 100);
        System.out.printf("%.2f%%%n",(peopleMonblan * 1.0/allpeople) * 100);
        System.out.printf("%.2f%%%n",(peopleKilimandjaro * 1.0/allpeople) * 100);
        System.out.printf("%.2f%%%n",(peopleK2 * 1.0/allpeople) * 100);
        System.out.printf("%.2f%%",(peopleEverst * 1.0/allpeople) * 100);

    }
}
