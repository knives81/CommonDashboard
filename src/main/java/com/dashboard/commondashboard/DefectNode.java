
package com.dashboard.commondashboard;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DefectNode {
    @Getter @Setter private Integer index;
    @Getter @Setter private String filter;
    @Getter @Setter private List<String> tags = null;
    @Getter @Setter private Target target;


}
