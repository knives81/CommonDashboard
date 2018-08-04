package com.dashboard.commondashboard;

public final class Chart {

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

	
}
