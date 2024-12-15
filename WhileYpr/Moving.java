package WhileYpr;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int shirochina = Integer.parseInt(scanner.nextLine());
        int duljina = Integer.parseInt(scanner.nextLine());
        int visochina = Integer.parseInt(scanner.nextLine());

        int allShirochinaDuljunaiVisochina = shirochina * duljina * visochina;


        String text = scanner.nextLine();
        int sumKybMetri=0;

        while (!text.equals("Done")){
            int kybichniMetri=Integer.parseInt(text);
            sumKybMetri=sumKybMetri + kybichniMetri;
            if(allShirochinaDuljunaiVisochina<sumKybMetri){
                break;
            }


            text=scanner.nextLine();
        }

        int diff = Math.abs(sumKybMetri - allShirochinaDuljunaiVisochina);

        if(text.equals("Done")){
            System.out.printf("%d Cubic meters left.",diff);
        }else{
            System.out.printf("No more free space! You need %d Cubic meters more.",diff);
        }
    }
}
