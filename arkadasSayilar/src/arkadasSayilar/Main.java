package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		// kendileri hariç pozitif tam bölenleri birbirine eşit olan sayilara arkadas
		// sayi denir.
		// örn: 220-284
		int sayi1 = 284;
		int sayi2 = 220;

		int toplam1 = 0;
		int toplam2 = 0;
		//284 tam bölenleri toplamı toplam1'e atandı.
		for (int i = 1; i < sayi1; i++) {
			if (sayi1 % i == 0) {
				toplam1 = toplam1 + i;
			}
		}
		System.out.println(sayi1 + " tam bolenleri toplami: " + toplam1);
		System.out.println("*******************************");
		//220 tam bölenleri toplamı toplam2'ye atandı.
		for (int i = 1; i < sayi2; i++) {
			if (sayi2 % i == 0) {
				toplam2 = toplam2 + i;
			}
		}
		System.out.println(sayi2 + " tam bolenleri toplami: " + toplam2);
		System.out.println("*******************************");
		//284 = toplam2 ve 220 = toplam1
		if (sayi1 == toplam2 && sayi2 == toplam1) {
			System.out.println("Bu sayilar arkadas sayilardir.");
		}
		else {
			System.out.println("Bu sayilar arkadas sayi degildir.");
		}
	}

}
