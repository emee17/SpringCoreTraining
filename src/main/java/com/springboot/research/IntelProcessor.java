package com.springboot.research;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component 
public class IntelProcessor implements Processor {

	@Value("90")
	private int propertyA;
	
	@Value("80")
	private int propertyB;
	
	

	public IntelProcessor(int propertyA, int propertyB) {
		super();
		this.propertyA = propertyA;
		this.propertyB = propertyB;
	}
	
	public IntelProcessor() {
		
	}

	public int getPropertyA() {
		return propertyA;
	}

	public void setPropertyA(int propertyA) {
		this.propertyA = propertyA;
	}

	public int getPropertyB() {
		return propertyB;
	}

	public void setPropertyB(int propertyB) {
		this.propertyB = propertyB;
	}

	@Override
	public String toString() {
		return "IntelProcessor [propertyA=" + propertyA + ", propertyB=" + propertyB + "]";
	}
		
}
