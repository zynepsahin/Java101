import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++)
        {
            for (int k = 1; k <= (n - i); k++)
                System.out.print(" ");
            for (int k = 1; k <= (i * 2) - 1; k++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = n - 1; i > 0; i--)
        {
            for (int k = 1; k <= n - i; k++)
                System.out.print(" ");
            for (int k = 1; k <= (i * 2) - 1; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
