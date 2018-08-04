
package com.dashboard.commondashboard;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Target {

    @Getter @Setter private String domain;
    @Getter @Setter private String project;
}
