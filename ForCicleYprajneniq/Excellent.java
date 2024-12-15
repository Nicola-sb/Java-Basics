package ForCicleYprajneniq;

import java.util.Scanner;

public class Excellent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberStudents = Integer.parseInt(scanner.nextLine());

        double fail = 0;
        double between3And4 = 0;
        double between4and5 = 0;
        double topStudents = 0;
        double allResult = 0;

        for(int i = 1;i<=numberStudents;i++){
            double result = Double.parseDouble(scanner.nextLine());
            allResult = allResult + result;


            if(result >=2 && result <=2.99){
                 fail++;
            }else if(result <=3.99){
                between3And4++;
            }else if(result <=4.99){
                between4and5++;
            }else{
            topStudents++;
            }
        }
        double averrage = allResult / numberStudents;

            System.out.printf("Top students: %.2f%%%n",topStudents / numberStudents * 100);
            System.out.printf("Between 4.00 and 4.99: %.2f%%%n",between4and5 / numberStudents * 100);
            System.out.printf("Between 3.00 and 3.99: %.2f%%%n",between3And4 / numberStudents * 100);
            System.out.printf("Fail: %.2f%%%n",fail / numberStudents * 100);
            System.out.printf("Average: %.2f",averrage);


    }
}
