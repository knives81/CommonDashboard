
package com.dashboard.commondashboard;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class TestsetConf extends EntityConfAbstract {

    @Getter @Setter private List<String> tagNames = null;
    @Getter @Setter private List<TestsetNode> nodes = null;

    @JsonIgnore
    public List<List<String>> getTags() {
    	List<List<String>> tagValues = new ArrayList<>();
    	for(TestsetNode node : nodes) {
    		tagValues.add(node.getTags());
    	}    	
    	return tagValues;
    }
    @JsonIgnore
    public List<Integer> getConfPositionIndexes() {
        List<Integer> confPositionIndexes = new ArrayList<>();
        for (TestsetNode node : nodes) {
            confPositionIndexes.add(node.getIndex());
        }
        return confPositionIndexes;
    }
    
}
