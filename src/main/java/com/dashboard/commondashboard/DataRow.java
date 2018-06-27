package com.dashboard.commondashboard;

import com.google.common.hash.Hashing;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;

@NoArgsConstructor

public abstract class DataRow {

	private static final SimpleDateFormat SDF = new SimpleDateFormat(Chart.DATE_FORMAT);
	
	@Id
	@Getter private String _id;
	@Getter private Integer configurationIndex;
	@Getter private String recordDate;
	@Getter private Integer entityId;
	@Getter private String status;
	
	
	public DataRow(Integer configurationIndex, Integer entityId, String status) {
		this(configurationIndex, entityId, status,new Date());
	}
	public DataRow(Integer configurationIndex, Integer entityId, String status, Date date) {
		this(configurationIndex,entityId,status,  SDF.format(date));
	}
	public DataRow(Integer configurationIndex, Integer entityId, String status, String recordDate) {
		super();
		this.configurationIndex = configurationIndex;
		this.entityId = entityId;
		this.status = status;
		
		this.recordDate = recordDate;
		
		String inputToBaHashed = recordDate+entityId+configurationIndex;
		_id = Hashing.md5().hashString(inputToBaHashed, StandardCharsets.UTF_8).toString();
	}
}
