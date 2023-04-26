package mukemmelSayi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.print("Bir sayı giriniz: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int sum = 0;
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0)
				sum += i;
		}
		if (number == sum)
			System.out.print(number + " Mükemmel sayıdır");
		else
			System.out.print(number + " Mükemmel sayı değildir");
	}
}
