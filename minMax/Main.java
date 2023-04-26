import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Kaç tane sayı gireceksiniz: ");
		int n = input.nextInt();
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

		for (int i = 1; i <= n; i++) {
			System.out.print(i+". sayıyı giriniz: ");
			int number = input.nextInt();
			max = number > max ? number : max;
			min = number < min ? number : min;
		}
		System.out.print("Max:" + max + "\nMin:" + min);
	}
}
