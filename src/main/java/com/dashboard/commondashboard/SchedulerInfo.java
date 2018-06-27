package com.dashboard.commondashboard;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@RequiredArgsConstructor
public class SchedulerInfo {

    @Id
    @Getter private final String _id;
    @Getter private final String schedulerVersion;
    @Getter private final String whenUpdated;


}
