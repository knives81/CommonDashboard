
package com.dashboard.commondashboard;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@ToString
public class ChartItem {

    @Getter @Setter private Integer confId;
    @Getter @Setter private List<Integer> ids = null;
    @Getter @Setter private String desc;
    @Getter @Setter private List<String> tags = null;
    @Getter @Setter private String chartType;
    @Getter @Setter private String entityType;

    @JsonIgnore @Getter @Setter private Boolean isVisible;
    @JsonIgnore @Getter @Setter private List<String> usernames = null;


}
