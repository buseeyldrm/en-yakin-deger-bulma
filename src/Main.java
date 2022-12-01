import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int [] dizi={15,12,788,1,-1,-788,2,0};
        System.out.println("Dizinin sıralanmış hali: " + Arrays.toString(dizi));

        Scanner klavye=new Scanner(System.in);
        System.out.print("Sayı gir: ");
        int sayi= klavye.nextInt();
        Arrays.sort(dizi);
        int enbuyuk=dizi[7];
        int enkucuk=dizi[0];



        for (int i: dizi){
          if (i>enkucuk && i<sayi){
            enkucuk=i;

        }
        if (i<enbuyuk && i>sayi){
            enbuyuk=i;
        }

        }


        System.out.println("Girilen sayıdan küçük en yakın sayı:" +enkucuk);
        System.out.println("Girilen sayıdam büyük en yakın sayı: " +enbuyuk);


        }

        }

