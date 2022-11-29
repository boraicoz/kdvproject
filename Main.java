import java.util.Scanner;


public class Main {
static Scanner input=new Scanner(System.in);
 public static void main(String[] args) {
double kdvtutar,kdvlifiyat;
     System.out.print("Para Degeri Giriniz:");
     double tutar=input.nextDouble();
     kdvtutar=(tutar>0&&tutar<=1000)?0.18:0.08;
     kdvlifiyat=(kdvtutar*tutar)+tutar;
     System.out.println("KDV'li Fiyat:"+(kdvlifiyat));
     System.out.println("KDV Tutari:"+kdvtutar);

    }
}