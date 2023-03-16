package miniProjeAsalSayi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int number = 1;
		System.out.print("Bir sayı giriniz: ");
		Scanner scanner = new Scanner(System.in);
		int sayi = scanner.nextInt();
		System.out.println(sayi + " sayisini girdiniz.");
		String messageString = number + " sayisi asal sayidir.";
		if (number == 1) {
			messageString = number + " sayisi asal degil.";
			System.out.println(messageString);
			return;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				messageString = number + " sayisi asal degil.";
				break;
			}
		}
		System.out.println(messageString);

	}
}