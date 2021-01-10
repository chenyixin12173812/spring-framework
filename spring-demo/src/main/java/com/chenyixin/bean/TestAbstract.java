package com.chenyixin.bean;

public abstract class TestAbstract {

	public String getAbstractName() {
		return abstractName;
	}

	public void setAbstractName(String abstractName) {
		this.abstractName = abstractName;
	}

	public String abstractName;

	@Override
	public String toString() {
		return "TestAbstract{" +
				"abstractName='" + abstractName + '\'' +
				'}';
	}
}
