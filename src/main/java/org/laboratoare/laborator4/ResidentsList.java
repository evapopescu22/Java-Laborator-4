package org.laboratoare.laborator4;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;



public class ResidentsList {
	List<Resident> residentList = new ArrayList<>();
	
	public ResidentsList() {
	
	}
	
	public ResidentsList (  List<Resident> residentList ) {
	
		this.residentList=residentList;
		
	}
	
	  public List<Resident> getResident() {
	        return residentList;
	    }

	    public void setResident(List<Resident> residentList) {
	        this.residentList = residentList;
	    }
	    public void addResident(Resident resident)
	    {
	        residentList.add(resident);
	    }
	    
	    @Override
	    public String toString() {
	    	Collections.sort(residentList,
	    			 Comparator.comparing(Resident::getName));
	        return 
	                " \nResidents preferences:" + residentList
	                ;
	    }
	    


}
