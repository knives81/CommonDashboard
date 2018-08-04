package com.dashboard.commondashboard;

public final class Entity {
	
	public enum EntityType {
		DEFECT("defect"),
		TESTSET("testset");

	    private String value;

	    EntityType(String value) {
	        this.value = value;
	    }

	    public String value() {
	        return value;
	    }
	}
	
	
}
