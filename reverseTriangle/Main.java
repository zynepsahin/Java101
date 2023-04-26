package triangle;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.print("Basamak sayısı: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < i; k++)
				System.out.print(" ");

			for (int k = (n - i) * 2 -1; k > 0; k--)
					System.out.print("*");
			System.out.print("\n");
		}
	}
}
