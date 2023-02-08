package com.sms.entity;

public final class Classes {
	public String name;
	public int strength;
	public Classes(String name, int strength) {
		super();
		this.name = name;
		this.strength = strength;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final int getStrength() {
		return strength;
	}
	public final void setStrength(int strength) {
		this.strength = strength;
	}
	@Override
	public String toString() {
		return "Classes [name=" + name + ", strength=" + strength + "]";
	}
	

}
