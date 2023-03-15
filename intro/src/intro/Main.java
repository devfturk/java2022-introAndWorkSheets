package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		String ortaMetin = "İlginiz Çekebilir";
		String altMetin = "Vade Süresi";
		
		System.out.println(ortaMetin);
		
		int vade = 40;
		double dolar = 40;
		float vade3 = 50.2f;
		
		boolean isValid = true;
		boolean isNotValid = false;
		
		String okYonu = "down.svg";
		if (dolar>vade) {
			System.out.println(okYonu);
		} else if(dolar<vade) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		String[] krediler = {"Hızlı Kredi","Maaşını Halkbanktan","Mutlu Emekli"};
		
		System.out.println(krediler[0]);
		System.out.println(krediler[1]);
		System.out.println(krediler[2]);
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}

		for (var item : krediler) {
			System.out.println(item);
		}
	}

}
