/**
 * 
 */
package com.main.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author amanb
 *
 */
public class FrequencyQueries {
	
	 static List<Integer> freqQuery(List<List<Integer>> queries) {
		
		 List<Integer> result = new ArrayList<>();
	        List<Integer> data = new ArrayList<>();
	        HashMap<Integer, Function<Integer, Boolean>> mapa = new HashMap<>();
	        mapa.put(1, o -> data.add(o));
	        mapa.put(2, o -> data.remove(o));
	        mapa.put(3, o -> { Map<Integer, Long> counts = data.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
	return result.add(counts.containsValue(new Long(o))? 1:0);
	        });
	        queries.forEach(integers -> {
	            mapa.get(integers.get(0)).apply(integers.get(1));
	        });
	        return  result;
         

	    }

}
