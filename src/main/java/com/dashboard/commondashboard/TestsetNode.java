
package com.dashboard.commondashboard;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TestsetNode {


    @Getter @Setter private Integer index;
    @Getter @Setter private List<Integer> testsetIds = null;
    @Getter @Setter private List<String> tags = null;
    @Getter @Setter private Target target;

}
