package com.dashboard.commondashboard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ColorMapper {
	
	public static final String GREEN = "#00B050";
	public static final String LIGHT_GREEN = "#92D050";
	public static final String YELLOW = "#FFFF00";
	public static final String LIGHT_RED = "#FC041C";
	public static final String RED = "#C00000";
	public static final String GREY = "#C0C0C0";
	public static final String LIGHT_GREY = "#303030";
	public static final String DEFAULT = "#808080";
	
	
	
	public static final Map<String, String> color2AlmTagsMapping;
    static
    {
    	color2AlmTagsMapping = new HashMap<String, String>();
    	color2AlmTagsMapping.put(AlmTags.PASSED, GREEN);
    	color2AlmTagsMapping.put(AlmTags.PASSED_WITH_DEFECT, LIGHT_GREEN);
    	color2AlmTagsMapping.put(AlmTags.NOT_COMPLETED, YELLOW);
    	color2AlmTagsMapping.put(AlmTags.BLOCKED, LIGHT_RED);
    	color2AlmTagsMapping.put(AlmTags.FAILED, RED);
    	color2AlmTagsMapping.put(AlmTags.NO_RUN, GREY);
    	color2AlmTagsMapping.put(AlmTags.NOT_AVAILABLE, LIGHT_GREY);
    	color2AlmTagsMapping.put(AlmTags.ASSIGNED, LIGHT_RED);
    	color2AlmTagsMapping.put(AlmTags.RESOLVED, LIGHT_GREEN);
    	color2AlmTagsMapping.put(AlmTags.CLOSED, GREEN);
    	color2AlmTagsMapping.put(AlmTags.RELEASED, LIGHT_GREEN);
    	color2AlmTagsMapping.put(AlmTags.OPENED, RED);
    	color2AlmTagsMapping.put(AlmTags.DUPLICATED, YELLOW);
    	
    }
    
    public static List<String> getColorsFromKey(List<String> keys) {
    	List<String> colors = new ArrayList<>();
    	for(String key : keys) {
    		if(color2AlmTagsMapping.get(key)!=null) {
    			colors.add(color2AlmTagsMapping.get(key));
    		} else {
    			colors.add(DEFAULT);
    		}
    	}
    	return colors;
    }

}
