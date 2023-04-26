import java.util.Scanner;

public class Main {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int number = input.nextInt();
        int digitcounter = 0;
        int result = 0;
        int tmpnbr;
        tmpnbr = number;

        while (tmpnbr != 0)
        {
            tmpnbr /= 10;
            digitcounter++;
        }
        for (int i = 0; i < digitcounter; i++)
        {
            result += number % 10;
            number /= 10;
        }
        System.out.print(result);
    }
}
