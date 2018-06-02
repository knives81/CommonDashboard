package com.dashboard.commondashboard;

import java.util.Date;

public class DataRowDefect extends DataRow{

	
	public DataRowDefect(Integer configurationIndex, Integer entityId, String status, Date date) {
		super(configurationIndex, entityId, status, date);
	}
	
	public DataRowDefect(Integer configurationIndex, Integer entityId, String status, String recordDate) {
		super(configurationIndex, entityId, status, recordDate);
	}
	
	public DataRowDefect() {
		super();
	}
}
