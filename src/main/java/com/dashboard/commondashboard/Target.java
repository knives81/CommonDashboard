
package com.dashboard.commondashboard;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "domaincontroller",
    "project"
})
public class Target {

    @JsonProperty("domaincontroller")
    private String domain;
    @JsonProperty("project")
    private String project;

    @JsonProperty("domaincontroller")
    public String getDomain() {
        return domain;
    }

    @JsonProperty("domaincontroller")
    public void setDomain(String domain) {
        this.domain = domain;
    }

    @JsonProperty("project")
    public String getProject() {
        return project;
    }

    @JsonProperty("project")
    public void setProject(String project) {
        this.project = project;
    }

}
