package p1;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BusinessOperations {

	public static void main(String[] args) {
		
		try {
			
			// ----------  Account 1 --------------------------------------------------------
			CityBankAccount account = new CityBankAccount();
			
			account.setAccountName("Amit");
			account.setBalance(15000);
			account.setBranchName("New Delhi 123");
			
			
			ClientAddress address = new ClientAddress();
			address.setHouseInfo("ABC-123");
			address.setCityName("Shimla");
			address.setState("Himachal");
			address.setPincod(151515);
			account.setPermamentAddress(address);
			
			ClientAddress tempaddress = new ClientAddress();
			tempaddress.setHouseInfo("A-123");
			tempaddress.setCityName("Mumbai");
			tempaddress.setState("Maharashtra");
			tempaddress.setPincod(78787);
			account.setTemoraryAddress(tempaddress);
			
			
			// ----------  Account 2 --------------------------------------------------------
			
			CityBankAccount account2 = new CityBankAccount();
			
			account2.setAccountName("Ramesh");
			account2.setBalance(50000);
			account2.setBranchName("Hydrabad-123");
			
			
			ClientAddress address2 = new ClientAddress();
			address2.setHouseInfo("Thetebjhv-123");
			address2.setCityName("Downtown Hydrabad");
			address2.setState("Telangana");
			address2.setPincod(5484848);
			account2.setPermamentAddress(address2);
			
			ClientAddress tempaddress2 = new ClientAddress();
			tempaddress2.setHouseInfo("A-456");
			tempaddress2.setCityName("Mumbai");
			tempaddress2.setState("Maharashtra");
			tempaddress2.setPincod(848484);
			account2.setTemoraryAddress(tempaddress2);
			
			
			
			// ----------  Data Insertion --------------------------------------------------------
			
			Configuration cfg = new Configuration();
			SessionFactory factory = cfg.configure().buildSessionFactory();
			Session hibernate = factory.openSession();   // hibernate - session
			
		
			
			// call insert operation
			Transaction t = hibernate.beginTransaction();
			hibernate.save(account);
			hibernate.save(account2);
			
			t.commit();
		
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
	}
}
