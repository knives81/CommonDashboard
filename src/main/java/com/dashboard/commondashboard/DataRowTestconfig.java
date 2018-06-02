package com.dashboard.commondashboard;

import java.util.Date;

public class DataRowTestconfig extends DataRow{
	
	public DataRowTestconfig(Integer configurationIndex, Integer entityId, String status, Date recordDate) {
		super(configurationIndex, entityId, status, recordDate);
	}
	
	public DataRowTestconfig(Integer configurationIndex, Integer entityId, String status, String recordDate) {
		super(configurationIndex, entityId, status, recordDate);
	}
	
	public DataRowTestconfig() {
		super();
	}

}
