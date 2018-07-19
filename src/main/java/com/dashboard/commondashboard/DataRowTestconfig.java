package com.dashboard.commondashboard;

import java.util.Date;

public class DataRowTestconfig extends DataRow{
	
	public DataRowTestconfig(Integer configurationIndex, Integer entityId, String status, Date recordDate, Target target, Entity.EntityType entity) {
		super(configurationIndex, entityId, status, recordDate,target,entity);
	}

	public DataRowTestconfig(Integer configurationIndex, Integer entityId, String status, String recordDate, Target target, Entity.EntityType entity) {
		super(configurationIndex, entityId, status, recordDate,target,entity);
	}

	public DataRowTestconfig() {
		super();
	}

}
