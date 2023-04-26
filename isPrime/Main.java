package isPrime;

public class Main {
	public static void main(String[] args) {
		int flag = 0;
		for (int i = 2; i < 100; i++) {
			for (int k = 2; k < i; k++) {
					if (i % k == 0) {
						flag = 1;
						break;
					}
			}
			if (flag == 0)
				System.out.print(i + " ");
			flag = 0;
		}
	}
}
