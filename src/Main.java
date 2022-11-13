// https://app.patika.dev
// https://app.patika.dev/thendbranch

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Ödev
            Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

            Geçme Notu : 55

            Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
         */

        Scanner input = new Scanner(System.in);

        int mat, fiz, tur, kim, muz;
        int toplam=0;
        int dersSayisi =0;

        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();
        if (mat >= 0 && mat <= 100){
            toplam += mat;
            dersSayisi++;
        }
        System.out.print("Fizik Notunuz : ");
        fiz = input.nextInt();
        if (fiz >= 0 && fiz <= 100){
            toplam += fiz;
            dersSayisi++;
        }
        System.out.print("Türkçe Notunuz : ");
        tur = input.nextInt();
        if (tur >= 0 && tur <= 100){
            toplam += tur;
            dersSayisi++;
        }
        System.out.print("Kimya Notunuz : ");
        kim = input.nextInt();
        if (kim >= 0 && kim <= 100){
            toplam += kim;
            dersSayisi++;
        }
        System.out.print("Müzik Notunuz : ");
        muz = input.nextInt();
        if (muz >= 0 && muz <= 100){
            toplam += muz;
            dersSayisi++;
        }

        double sonuc = toplam / dersSayisi;

        if (sonuc > 55) {
            System.out.println("Ortalamanız : " + sonuc + "Geçtiniz");
        }else {
            System.out.println("Kaldınız.");
        }


    }
}