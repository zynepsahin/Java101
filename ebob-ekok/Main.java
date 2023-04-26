import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("1.sayıyı giriniz: ");
		int n1 = input.nextInt();
		System.out.print("2.sayıyı giriniz:");
		int n2 = input.nextInt();
		int ekok, ebob = 1;

		int i = n1 < n2 ? n1 : n2;
		while (i-- > 1)
			if (n1 % i == 0 && n2 % i == 0) {
				ebob = i;
				break;
			}
		ekok = (n1 * n2) / ebob;
		System.out.print("EBOB: " + ebob + "\nEKOK: " + ekok);
	}
}
