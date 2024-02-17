import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int sayi;
        int toplam=1;
        System.out.println("bir sayi giriniz");
        Scanner scan=new Scanner(System.in);
        sayi= scan.nextInt();

        for (int i=1; i<=sayi; i++){
           // System.out.println(sayi*i);
            toplam*=i;

        }
        System.out.println(sayi+ "'nin faktoriyeli :" +toplam);
    }
}