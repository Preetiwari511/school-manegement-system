package com.sms.enums;

public enum AddressType {
	PERMANENT("Permanent"), POSTAL("Postal");
	private String addressType;
	AddressType(String string) {
		this.addressType = string;
	}
	
	public String getAddressType() {
		return this.addressType;
	}

}
