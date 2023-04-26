import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int mat, fizik, kimya, turkce, tarih, muzik;

        System.out.print("Matematik notunuzu giriniz:");
        mat = inp.nextInt();

        System.out.print("Fizik notunuzu giriniz:");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuzu girniz:");
        kimya = inp.nextInt();

        System.out.print("Türkçe notunuzu giriniz:");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuzu giriniz:");
        tarih = inp.nextInt();

        System.out.print("Müzik notunuzu giriniz:");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);

        double ort = toplam / 6.0;

        System.out.println("Ortalama:" + ort);

        String sonuc = ort >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.print(sonuc);

    }

}
