import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int a=input.nextInt();
        int toplam=0,sayi=0,ortalama;
        for(int i=1;i<=a;i++){
            if(i%3==0 && i%4==0){
                sayi++;
                toplam=toplam+i;
            }
        }
        ortalama=toplam/sayi;
        System.out.println("3 ve 4 e tam bölünebilen sayıların ortalaması: "+ortalama);
    }
}
