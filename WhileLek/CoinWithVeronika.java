package WhileLek;

import java.util.Scanner;

public class CoinWithVeronika {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

       double change = Double.parseDouble(scanner.nextLine());

       double coinsChange = change * 100;

       int counterCoins =0;

       while (coinsChange>0){
           coinsChange=Math.round(coinsChange);
           if(coinsChange>=200){
               coinsChange=coinsChange - 200;
               counterCoins++;
           }else if(coinsChange>=100){
               coinsChange = coinsChange - 100;
               counterCoins++;
           }else if(coinsChange>=50){
               coinsChange=coinsChange-50;
               counterCoins++;
           }else if(coinsChange>=20) {
               coinsChange = coinsChange - 20;
               counterCoins++;
           }else if(coinsChange>=10) {
               coinsChange = coinsChange - 10;
               counterCoins++;
           }else if(coinsChange>=5) {
               coinsChange = coinsChange - 5;
               counterCoins++;
           }else if(coinsChange>=2) {
               coinsChange = coinsChange -2;
               counterCoins++;
           }else if(coinsChange>=0.01) {
               coinsChange = coinsChange - 1;
               counterCoins++;
           }else{
               break;
           }
       }
       System.out.println(counterCoins);

    }
}
