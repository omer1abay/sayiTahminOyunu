import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while(true){
            System.out.println("Sayı tahmin oyununa hoşgeldiniz..");
            System.out.println("0-100 arası bir sayı giriniz");
            int number = random.nextInt(100);
            int index = 0;

            for(int i = 0; i < 5; i++){
                System.out.print("Lütfen bir sayı giriniz : ");
                int number1 = scanner.nextInt();

                if(number == number1){
                    System.out.println("Doğru tahmin..");
                    break;
                }else if(number < number1){
                    System.out.println("Lütfen daha küçük bir sayı giriniz.");
                    index++;
                }else if(number > number1){
                    System.out.println("Lütfen daha büyük bir sayı giriniz..");
                    index++;
                }

                if(index == 5 && number != number1){
                    System.out.println("Üzgünüm kaybettiniz..");
                }
            }

            System.out.println("Devam etmek ister misiniz? e/h");
            String yeniden = scanner.next();

            if(yeniden.equals("e")){
                continue;
            }else if(yeniden.equals("h")){
                break;
            }

        }
    }
}
