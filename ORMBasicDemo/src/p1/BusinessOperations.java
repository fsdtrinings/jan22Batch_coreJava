package p1;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BusinessOperations {

	public static void main(String[] args) {
		
		try {
			CityBankAccount account = new CityBankAccount();
			
			account.setAccountName("Suresh Kumar");
			account.setBalance(15000);
			account.setBranchName("New Delhi 123");
			account.setState("Delhi");
			account.setCountry("India");
			
			System.out.println(" --- Stage 1 Done ---");
			/* save account to the DB  */
			// ----------------------------
			
			// DB Connection 
			
			Configuration cfg = new Configuration();
			System.out.println("1.1");
			SessionFactory factory = cfg.configure().buildSessionFactory();
			System.out.println("1.2");
			Session hibernate = factory.openSession();   // hibernate - session
			
			System.out.println(" --- Stage 2 Done --- "+hibernate);
			
			// call insert operation
			Transaction t = hibernate.beginTransaction();
			System.out.println(" --- Stage 3 Transaction Created  ---"+t);
			hibernate.save(account);
			System.out.println(" --- Stage 4 Data Saved  ---");
			t.commit();
			System.out.println(" --- Stage 5 Database Commited , Action Completed ---");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
	}
}
