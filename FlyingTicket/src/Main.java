import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int km, age, passageType;
        double price;
        boolean isError = false;

        System.out.print("Mesafeyi km türünden giriniz: ");
        km = inp.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        age = inp.nextInt();

        if (age < 0 || km < 0)
            isError = true;

        System.out.print("Yolculuk tipini giriniz (1=> Tek yön , 2 => Gidiş Dönüş): ");
        passageType = inp.nextInt();

        price = km * 0.10;

        if (age < 12)
            price *= 0.5;
        else if (age < 24)
            price *= 0.90;

        else if (age > 65)
            price *= 0.70;


        if (passageType == 1)
            System.out.println(price);
        else if (passageType == 2){
            price = (price * 0.80) * 2;
            System.out.println(price);
        }
        else
            isError = true;


        if (isError)
            System.out.println("Hatalı giriş yaptınız!");
    }
}