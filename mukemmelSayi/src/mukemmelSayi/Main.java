package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		//Mükemmel sayi: tam bölenlerinin toplamı 
		int number = 27;
		int total = 0;
		
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = total +i;
			}
		}
		if (number == total) {
			System.out.println("Bu sayi bir mükemmel sayidir.");
		}
		else {
			System.out.println("Mükemmel sayi degildir.");
		}
	}
}
