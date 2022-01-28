package com.mkj.app.beans;

import org.springframework.stereotype.Component;

@Component
public class CarPolicy extends Policy {

	@Override
	public String toString() {
		return "CarPolicy [getPolicyId()=" + getPolicyId() + ", getPolicyName()=" + getPolicyName()
				+ ", getSumAssured()=" + getSumAssured() + ", getPremiumAmount()=" + getPremiumAmount()
				+ ", toString()=" + super.toString() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ "]";
	}

	
}
