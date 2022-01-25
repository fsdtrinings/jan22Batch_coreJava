package p1;

import javax.persistence.Embeddable;

@Embeddable
public class ClientAddress {
	
	private String cityName;
	private String state;
	private String houseInfo;
	private long pincod;
	public ClientAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ClientAddress(String cityName, String state, String houseInfo, long pincod) {
		super();
		this.cityName = cityName;
		this.state = state;
		this.houseInfo = houseInfo;
		this.pincod = pincod;
	}
	
	
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getHouseInfo() {
		return houseInfo;
	}
	public void setHouseInfo(String houseInfo) {
		this.houseInfo = houseInfo;
	}
	public long getPincod() {
		return pincod;
	}
	public void setPincod(long pincod) {
		this.pincod = pincod;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	

}
