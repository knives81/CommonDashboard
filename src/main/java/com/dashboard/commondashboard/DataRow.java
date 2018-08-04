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

	public DataRow(Integer configurationIndex, Integer entityId, String status, Date date,Target target, Entity.EntityType entity) {
		this(configurationIndex,entityId,status,  SDF.format(date),target,entity);
	}
	public DataRow(Integer configurationIndex, Integer entityId, String status, String recordDate, Target target, Entity.EntityType entity) {
		super();
		this.configurationIndex = configurationIndex;
		this.entityId = entityId;
		this.status = status;
		
		this.recordDate = recordDate;
		
		String inputToBaHashed = recordDate+entityId.toString()+configurationIndex.toString()+target.toString()+entity.value();
		_id = Hashing.md5().hashString(inputToBaHashed, StandardCharsets.UTF_8).toString();

	}
}
