package youtubeEgitim;

import java.util.stream.BaseStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// değer tip
//		int sayi1 = 10;
//		int sayi2 = 20;
//		sayi1 = sayi2;// 20//sayi1'in değeri sayi2 nin değeri ile eşitlendi.
//		sayi2 = 100;// 100
//
//		System.out.println(sayi1);// 20
//		// referans tip
//		int[] sayilar1 = { 1, 2, 3 };
//		int[] sayilar2 = { 10, 20, 30 };
//		sayilar1 = sayilar2;// sayilar1 artık sayilar2 ile aynı yeri gösteriyor.
//		sayilar2[0] = 1000;
//		System.out.println(sayilar1[0]);// 1000
//
//		CreditManager creditManager = new CreditManager();
//		creditManager.calculate();
//		creditManager.save();
//
//		Customer customer = new Customer();
//		customer.id = 1;
//		customer.city = "Ankara";
//
//		CustomerManager customerManager = new CustomerManager(customer);
//		customerManager.save();
//		customerManager.delete();
//
//		
//		Company company = new Company();
//		company.companyName = "Arçelik";
//		company.id = 10;
//		
//		company.taxNumber = "100000";
//
//		Person person = new Person();
//		person.nationalIdentity = "12312312312";
//		
//		Customer c1 = new Customer();
//		Customer c2 = new Person();
//		Customer c3 = new Company();

		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCrediManager());
	}

}

abstract class BaseCreditManager implements ICreditManager{

	@Override
	public abstract void calculate();

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("Kaydedildi.");
	}
	
}

class TeacherCrediManager extends BaseCreditManager implements ICreditManager{

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("Öğretmen kredisi hesaplandı.");
		
	}
	@Override
	public void save() {
		// TODO Auto-generated method stub
		super.save();
	}
	
}

class MilitaryCrediManager implements ICreditManager{

	@Override
	public void calculate() {
		System.out.println("Asker kredisi hesaplandı.");
		
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}
	
}

interface ICreditManager{
	void calculate();
	void save();
}
class Person extends Customer{
	
	public String nationalIdentity;
	public String firstName;
	public String lastName;
	
}

class Company extends Customer {
	public String companyName;
	public String taxNumber;
}

class CustomerManager {
	private Customer customer;
	private ICreditManager creditManager;

	public CustomerManager(Customer customer, ICreditManager creditManager) {
		this.customer = customer;
		this.creditManager = creditManager;
	}

	public void save() {
		System.out.println("Müşteri Kaydedildi : ");
	}

	public void delete() {
		System.out.println("Müşteri Silindi : ");
	}
	public void giveCredit() {
		creditManager.calculate();
		System.out.println("Kredi verildi.");
	}
}

class Customer {
	public int id;
	public String city;

	public Customer() {
		System.out.println("Müşteri nesnesi başlatıldı.");
	}
}

class CreditManager {
	public void calculate() {
		System.out.println("Hesaplandı.");
	}

	public void save() {
		System.out.println("Kredi verildi.");
	}
}
