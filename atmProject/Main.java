import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String userName, password;
		Scanner input = new Scanner(System.in);
		int right = 3;
		int balance = 1000;
		int select;

		while (right > 0) {
			System.out.print("Kullanıcı adınız: ");
			userName = input.nextLine();
			System.out.print("Parolanız: ");
			password = input.nextLine();

			if (userName.equals("patika") && password.equals("dev123")) {
				System.out.println("Hoş geldiniz!");
				do {
				System.out.print("1- Para Yatırma\n2- ParaÇekme\n" +
				"3- Bakiye Sorgula\n4- Çıkış\n" +
				"Lütfen yapmak istediğiniz işlemi seçiniz: ");
				select = input.nextInt();
				switch (select)
				{
					case 1:
						System.out.print("Yatırmak istediğiniz para tutarı: ");
						int price = input.nextInt();
						balance += price;
						break;
					case 2:
						System.out.print("Çekmek istediğiniz para tutarı: ");
						price = input.nextInt();
						if (price > balance)
							System.out.println("Bakiye yeterli değil");
						else
							balance -= price;
						break;
					case 3:
						System.out.println("Bakiyeniz: " + balance);
						break;
					case 4:
						System.out.println("Hoşçakalın!");
						break;
					default:
						System.out.println("Yanlış numara girdniz");
				}
				} while (select != 4);
					break;
			} else {
				--right;
				System.out.println("Hatalı giriş yaptınız. Tekrar deneyiniz.");
				if (right == 0)
					System.out.println("Hesabınız bloke olmuştur. Banka ile iletişime geçiniz.");
				}
		}
	}
}
