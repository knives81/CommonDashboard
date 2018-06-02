
package com.dashboard.commondashboard;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "index",
    "testsetIds",
    "tags",
    "target"
})
public class TestsetNode {

    @JsonProperty("index")
    private Integer index;
    @JsonProperty("testsetIds")
    private List<Integer> testsetIds = null;
    @JsonProperty("tags")
    private List<String> tags = null;
    @JsonProperty("target")
    private Target target;

    @JsonProperty("index")
    public Integer getIndex() {
        return index;
    }

    @JsonProperty("index")
    public void setIndex(Integer index) {
        this.index = index;
    }

    @JsonProperty("testsetIds")
    public List<Integer> getTestsetIds() {
        return testsetIds;
    }

    @JsonProperty("testsetIds")
    public void setTestsetIds(List<Integer> testsetIds) {
        this.testsetIds = testsetIds;
    }

    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @JsonProperty("target")
    public Target getTarget() {
        return target;
    }

    @JsonProperty("target")
    public void setTarget(Target target) {
        this.target = target;
    }

}
