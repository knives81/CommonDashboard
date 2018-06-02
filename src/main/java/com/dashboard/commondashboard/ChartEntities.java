package com.dashboard.commondashboard;

public final class ChartEntities {

	public final static String DATE_FORMAT = "yyyy-MM-dd";
	

	
	public enum ChartType {
		PIECHART("piechart"),
		LINECHART("linechart");	    

	    private String value;

	    ChartType(String value) {
	        this.value = value;
	    }

	    public String value() {
	        return value;
	    }
	}
	
	
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
