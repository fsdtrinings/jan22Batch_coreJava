package p1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
// @Table(name="ABC")
public class CityBankAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accontNumber;
	
	private String accountName;
	
	private int balance;
	
	private String branchName;
	private String state;
	private String country;
	public CityBankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CityBankAccount(int accontNumber, String accountName, int balance, String branchName, String state, String country) {
		super();
		this.accontNumber = accontNumber;
		this.accountName = accountName;
		this.balance = balance;
		this.branchName = branchName;
		this.state = state;
		this.country = country;
	}
	public int getAccontNumber() {
		return accontNumber;
	}
	public void setAccontNumber(int accontNumber) {
		this.accontNumber = accontNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "CityBankAccount [accontNumber=" + accontNumber + ", accountName=" + accountName + ", balance=" + balance
				+ ", branchName=" + branchName + ", state=" + state + ", country=" + country + "]";
	}
	@Override
	public int hashCode() {
		return (int)(accontNumber+(accountName.length()+3)+balance/3+(country.length()+5));
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof CityBankAccount)
		{
			CityBankAccount acc2 = (CityBankAccount)obj;
			
			boolean a = (this.accontNumber == acc2.accontNumber);
			boolean b = (this.getAccountName().equals(acc2.getAccountName()));
			boolean c = (this.getBalance() == acc2.getBalance());
			boolean d = (this.getState().equals(acc2.getState()));
			boolean e = (this.getCountry().equals(acc2.getCountry()));
			boolean f = (this.getBranchName().equals(acc2.getBranchName()));
			
			return a&&b&&c&&d&&e&&f;
		}
		else return false;
	}
	
	
	
	
}
