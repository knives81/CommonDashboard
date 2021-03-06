package com.dashboard.commondashboard;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@ToString
public class ChartItemWithGroup {

    @Getter String group;
    @Getter List<ChartItem> chartItems;

}
