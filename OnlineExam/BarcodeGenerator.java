package OnlineExam;

import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum=Integer.parseInt(scanner.nextLine());
        int endNum=Integer.parseInt(scanner.nextLine());

        int startNumedinici=startNum % 10;
        int starNumDesetici=startNum / 10 % 10;
        int startNumStotici=startNum / 100 % 10;
        int startNumHilqdni = startNum / 1000 % 10;

        int endNumEdi = endNum % 10;
        int endNumDesetici = endNum / 10 % 10;
        int endNumStotici = endNum / 100 % 10;
        int endNumHilqdni = endNum / 1000 % 10;



        for(int i=startNumHilqdni;i<=endNumHilqdni;i++){
            for(int j=startNumStotici;j<=endNumStotici;j++){
                for(int k=starNumDesetici;k<=endNumDesetici;k++){
                    for(int l=startNumedinici;l<=endNumEdi;l++){
                        boolean isOdd = (i % 2 !=0) && (j % 2 !=0) && (k % 2 !=0) && (l % 2 !=0);
                        if(isOdd){
                            System.out.printf("%d%d%d%d ",i,j,k,l);
                        }

                    }
                }
            }
        }
    }
}
