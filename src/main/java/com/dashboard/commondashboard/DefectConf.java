
package com.dashboard.commondashboard;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class DefectConf extends EntityConfAbstract {

    @Getter @Setter private List<String> tagNames = null;
    @Getter @Setter private List<Filter> filters = new ArrayList<>();
    @Getter @Setter private List<DefectNode> nodes = null;

    @JsonIgnore
    public List<List<String>> getTags() {
    	List<List<String>> tagValues = new ArrayList<>();
    	for(DefectNode node : nodes) {
    		tagValues.add(node.getTags());
    	}    	
    	return tagValues;
    }
    @JsonIgnore
    public List<Integer> getConfPositionIndexes() {
        List<Integer> confPositionIndexes = new ArrayList<>();
        for (DefectNode node : nodes) {
            confPositionIndexes.add(node.getIndex());
        }
        return confPositionIndexes;
    }

}
