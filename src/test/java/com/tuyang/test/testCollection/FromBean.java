package com.tuyang.test.testCollection;

import java.util.List;

public class FromBean {
	
	private int beanInt;
	private long beanLong;

	private String beanString;
	
	private List<FromBean2> beanList;

	public int getBeanInt() {
		return beanInt;
	}

	public void setBeanInt(int beanInt) {
		this.beanInt = beanInt;
	}

	public long getBeanLong() {
		return beanLong;
	}

	public void setBeanLong(long beanLong) {
		this.beanLong = beanLong;
	}
	public String getBeanString() {
		return beanString;
	}

	public void setBeanString(String beanString) {
		this.beanString = beanString;
	}

	public List<FromBean2> getBeanList() {
		return beanList;
	}

	public void setBeanList(List<FromBean2> beanList) {
		this.beanList = beanList;
	}
	
	
}