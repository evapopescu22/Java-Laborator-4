package org.laboratoare.laborator4;

import java.util.Comparator;

public class Comparable implements Comparator<Hospital> {
    public int compare(Hospital a, Hospital b)
    {
        return a.getName().compareTo(b.getName());
    }
    	
    

	public int compareTo(Hospital a) {
		
		return 0;
	
		
	}

}
