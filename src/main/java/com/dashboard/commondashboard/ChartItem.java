
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

    @JsonIgnore @Getter @Setter public String _id;
    @Getter @Setter public Integer confId;
    @Getter @Setter public List<Integer> ids = null;
    @Getter @Setter public String desc;
    @Getter @Setter public List<String> tags = null;
    @Getter @Setter public String chartType;
    @Getter @Setter public String entityType;
    @JsonIgnore @Getter @Setter public Boolean isVisible;
    @JsonIgnore @Getter @Setter public List<String> usernames = null;
    @JsonIgnore @Getter @Setter public String _class;


}
