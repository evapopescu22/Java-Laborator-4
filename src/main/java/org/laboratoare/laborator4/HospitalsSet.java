package org.laboratoare.laborator4;
import java.util.Set;
import java.util.TreeSet;

public class HospitalsSet  {
	
	Set<Hospital> hospitalSet = new TreeSet<>(); 
	
	public HospitalsSet() {
	
	}
	
	public HospitalsSet (  Set<Hospital> hospitalSet ) {
	
		this.hospitalSet=hospitalSet;
		
	}
	
	  public Set<Hospital> getHospital() {
	        return hospitalSet;
	    }

	    public void setHospital(Set<Hospital> hospitalSet1) {
	        this.hospitalSet = hospitalSet1;
	    }
	    public void addHospital(Hospital hospital)
	    {
	        hospitalSet.add(hospital);
	    }
	    
	        public  String toString() {
	        
	    		        return 
	                " \nResidents preferences:" + hospitalSet
	                ;
	    }

			
			
				
			}		
	


