
package com.dashboard.commondashboard;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tagNames",
    "testsetNodes"
})
public class TestsetConf extends EntityConfAbstract {

    @JsonProperty("tagNames")
    private List<String> tagNames = null;
    @JsonProperty("testsetNodes")
    private List<TestsetNode> testsetNodes = null;

    @JsonProperty("tagNames")
    public List<String> getTagNames() {
        return tagNames;
    }

    @JsonProperty("tagNames")
    public void setTagNames(List<String> tagNames) {
        this.tagNames = tagNames;
    }

    @JsonProperty("testsetNodes")
    public List<TestsetNode> getTestsetNodes() {
        return testsetNodes;
    }

    @JsonProperty("testsetNodes")
    public void setTestsetNodes(List<TestsetNode> testsetNodes) {
        this.testsetNodes = testsetNodes;
    }

    public List<List<String>> getTags() {
    	List<List<String>> tagValues = new ArrayList<>();
    	for(TestsetNode testsetNode : testsetNodes) {
    		tagValues.add(testsetNode.getTags());
    	}    	
    	return tagValues;
    }
    
}
