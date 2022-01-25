package p1;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;

@Entity
public class CityBankAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accontNumber;
	private String accountName;
	private int balance;
	private String branchName;

		
	@Embedded
	private ClientAddress permamentAddress;
	
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="houseInfo",column=@Column(name="Temporary_HouseInfo",nullable=true)),
		@AttributeOverride(name="cityName",column=@Column(name="Temporary_CityName",nullable=true)),
		@AttributeOverride(name="state",column=@Column(name="Temporary_stateName",nullable=true)),
		@AttributeOverride(name="pincod",column=@Column(name="Temporary_pincode",nullable=true))
		
	})
	private ClientAddress temoraryAddress;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="policy")
	List<Policy> policies;
	
	public CityBankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public List<Policy> getPolicies() {
		return policies;
	}




	public void setPolicies(List<Policy> policies) {
		this.policies = policies;
	}




	public ClientAddress getTemoraryAddress() {
		return temoraryAddress;
	}



	public void setTemoraryAddress(ClientAddress temoraryAddress) {
		this.temoraryAddress = temoraryAddress;
	}



	public ClientAddress getPermamentAddress() {
		return permamentAddress;
	}
	public void setPermamentAddress(ClientAddress permamentAddress) {
		this.permamentAddress = permamentAddress;
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
	
	@Override
	public int hashCode() {
		return (int)(accontNumber+(accountName.length()+3)+balance/3+(permamentAddress.getCityName().length()+5));
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof CityBankAccount)
		{
			CityBankAccount acc2 = (CityBankAccount)obj;
			
			boolean a = (this.accontNumber == acc2.accontNumber);
			boolean b = (this.getAccountName().equals(acc2.getAccountName()));
			boolean c = (this.getBalance() == acc2.getBalance());
			
			boolean f = (this.getBranchName().equals(acc2.getBranchName()));
			
			return a&&b&&c&&f;
		}
		else return false;
	}
	
	
	
	
}


//@Table(name="ABC")