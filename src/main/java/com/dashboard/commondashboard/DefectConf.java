
package com.dashboard.commondashboard;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tagNames",
    "filters",
    "defectNodes"
})
public class DefectConf extends EntityConfAbstract {

    @JsonProperty("tagNames")
    private List<String> tagNames = null;
    @JsonProperty("filters")
    private List<Filter> filters = new ArrayList<>();
    @JsonProperty("defectNodes")
    private List<DefectNode> defectNodes = null;

    @JsonProperty("tagNames")
    public List<String> getTagNames() {
        return tagNames;
    }

    @JsonProperty("tagNames")
    public void setTagNames(List<String> tagNames) {
        this.tagNames = tagNames;
    }

    @JsonProperty("filters")
    public List<Filter> getFilters() {
        return filters;
    }

    @JsonProperty("filters")
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    @JsonProperty("defectNodes")
    public List<DefectNode> getDefectNodes() {
        return defectNodes;
    }

    @JsonProperty("defectNodes")
    public void setDefectNodes(List<DefectNode> defectNodes) {
        this.defectNodes = defectNodes;
    }
    
    public List<List<String>> getTags() {
    	List<List<String>> tagValues = new ArrayList<>();
    	for(DefectNode node : defectNodes) {
    		tagValues.add(node.getTags());
    	}    	
    	return tagValues;
    }

}
