package methods2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mesajString = "Bugün hava çok güzel";
		String yenimesajString = mesajString.substring(0, 2);
		System.out.println(yenimesajString);

	}

	public static void ekle() {
		System.out.println("Eklendi.");
	}

	public static void sil() {
		System.out.println("Silindi.");
	}

	public static void guncelle() {
		System.out.println("Güncellendi.");
	}

	public static int topla(int a, int b) {
		return a + b;
	}

	public static int topla2(int... sayilar) { // variable arguments
		int toplam = 0;
		for (int i : sayilar) {
			toplam += i;
		}
		return toplam;
	}
}
