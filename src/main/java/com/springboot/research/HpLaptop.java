package com.springboot.research;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HpLaptop {

	public HpLaptop(String rAM, String storage, Processor processor) {
		super();
		RAM = rAM;
		this.storage = storage;
		this.processor = processor;
	}
	
	public HpLaptop() {
		
	}

	private String RAM;
	private String storage;
	
	@Autowired
	@Qualifier("amdProcessor")
	private Processor processor;
	
	public String getRAM() {
		return RAM;
	}

	public void setRAM(String rAM) {
		RAM = rAM;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "HPLaptop [RAM=" + RAM + ", storage=" + storage + ", Processor=" + processor + "]";
	}
}
