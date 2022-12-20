package com.drools.model;

public enum CustomerType {
	 LOYAL, NEW, DISSATISFIED;
	 
    public String getValue() {
        return this.toString();
    }

}
