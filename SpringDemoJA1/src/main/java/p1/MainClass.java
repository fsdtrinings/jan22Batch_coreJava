package p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("spring.xml");
		
		/*Account a1 = (Account)spring.getBean("pqr");
		
		Account a2 = (Account)spring.getBean("xyz");
		System.out.println(a1);
		System.out.println(a2);
		
		*/
		
		Account a3 = (Account)spring.getBean("account3");
		System.out.println(a3);
		System.out.println(a3.getP());
		System.out.println(a3.getFile());
		
		
		a3.setAccountName("Mike");
		System.out.println(a3);
		
		System.out.println("------------ New Get bean Call --------");
		
		Account a4 = (Account)spring.getBean("account3");
		System.out.println(a4);
		
		spring.close();
		
	}

}
