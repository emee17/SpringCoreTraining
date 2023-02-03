package com.springboot.research;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class AmdProcessor implements Processor {

	private int propertyA;
	
	private int propertyB;
	
	

	public AmdProcessor(int propertyA, int propertyB) {
		super();
		this.propertyA = propertyA;
		this.propertyB = propertyB;
	}
	
	public AmdProcessor () {}
	

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
		return "AmdProcessor [propertyA=" + propertyA + ", propertyB=" + propertyB + "]";
	}
		
}
