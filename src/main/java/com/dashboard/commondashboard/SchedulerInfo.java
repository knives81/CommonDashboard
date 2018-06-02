package com.dashboard.commondashboard;

import lombok.Getter;
import org.springframework.data.annotation.Id;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class SchedulerInfo {

    private static final String DATE_FORMAT_WITH_TIME = "dd-MM-yy HH.mm.ss";

    @Id
    @Getter final private String _id = "1234567890";
    @Getter final private String schedulerVersion = "1.0";
    @Getter private String updateDate;

    public SchedulerInfo(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_WITH_TIME);
        sdf.setTimeZone(TimeZone.getTimeZone("Europe/Rome"));
        this.updateDate = sdf.format(date);
    }
}
