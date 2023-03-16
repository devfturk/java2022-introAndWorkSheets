package arraysDemo;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "Engin";
		String ogrenci2 = "Furkan";
		
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Furkan";
		ogrenciler[2] = "Derin";
		ogrenciler[3] = "Ahmet";
		//ogrenciler[4] = "Ali";
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]); 
			
		}
		System.out.println("**********************************");
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
		
		//@region
		double[] myList = {1.2,1.3,4.3,5.6};
		double total = 0;
		double max = myList[0];
		for (double number : myList) {
			if (max < number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}
		System.out.println("Toplam = " + total);
		System.out.println("En büyük : " + max);
		//@regionend
		//region Çift bouytlu array
		String[][] sehirler = new String[3][3];
		for (int i = 0; i < sehirler.length; i++) {
			System.out.println("***********************");
			
			
			for (int j = 0; j < sehirler.length; j++) {
				sehirler[i][j] = "i degeri : " + i + " J değeri : " + j;
				System.out.println(sehirler[i][j]);
				
			}
		}
		
	}

}
