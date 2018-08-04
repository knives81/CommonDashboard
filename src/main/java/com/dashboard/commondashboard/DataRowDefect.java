package com.dashboard.commondashboard;

import java.util.Date;

public class DataRowDefect extends DataRow{

	
	public DataRowDefect(Integer configurationIndex, Integer entityId, String status, Date date, Target target, Entity.EntityType entity) {
		super(configurationIndex, entityId, status, date,target,entity);
	}
	
	public DataRowDefect(Integer configurationIndex, Integer entityId, String status, String recordDate, Target target, Entity.EntityType entity) {
		super(configurationIndex, entityId, status,recordDate,target,entity);
	}
	
	public DataRowDefect() {
		super();
	}
}
