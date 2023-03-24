package abstactDemo;

public class CustomerManager {
	
	BaseDataBaseManager dataBaseManager;
	
	public void getCustomers() {
		dataBaseManager.getData();
	}
}
