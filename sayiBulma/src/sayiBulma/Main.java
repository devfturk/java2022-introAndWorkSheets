package sayiBulma;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = {1,2,5,7,9,0};
		int aranacak = 4;
		
		boolean varMi = false;
		
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		if (varMi) {
			System.out.println("Sayi mevcut");
		}
		else {
			System.out.println("Sayi mevcut degildir.");
		}
	}

}
