package org.laboratoare.laborator4;
import java.util.*;
import java.util.stream.IntStream;

public class Main 
{
    

	public static void main( String[] args )
    {   
    	var r = IntStream.rangeClosed(0, 3)
    			 .mapToObj(i -> new Resident("R" + i) )
    			 .toArray(Resident[]::new);  
    	    	
    	ResidentsList resident1=new ResidentsList();
    	List<Resident> residentList = new ArrayList<>();
    	residentList.addAll( Arrays.asList(r) );
    	resident1.setResident(residentList);
    	
    	var h = IntStream.rangeClosed(0, 2)
   			 .mapToObj(i -> new Hospital("H" + i ) )
   			 .toArray(Hospital[]::new);  
    	
    	HospitalsSet hospital1=new HospitalsSet ();
    	Set<Hospital> hospitalSet = new TreeSet<Hospital>(new Comparable());
    	hospitalSet.addAll( Arrays.asList(h) );
        hospital1.setHospital(hospitalSet);
        
        Map<Resident, List<Hospital>> resPrefMap = new HashMap<>();
    	resPrefMap.put(r[0], Arrays.asList(h[0], h[1], h[2]));
    	resPrefMap.put(r[1], Arrays.asList(h[0], h[1], h[2]));
    	resPrefMap.put(r[2], Arrays.asList(h[0], h[1]));
    	resPrefMap.put(r[3], Arrays.asList(h[0], h[2]));
    	
        Map<Hospital, List<Resident>> hosPrefMap = new HashMap<>();
    	hosPrefMap.put(h[0], Arrays.asList(r[3], r[0], r[1], r[2]));
    	hosPrefMap.put(h[1], Arrays.asList(r[0], r[2], r[1]));
    	hosPrefMap.put(h[2], Arrays.asList(r[0], r[1], r[3]));
    	
    	
    	System.out.println(resPrefMap);
    	System.out.println(hosPrefMap);
    
    	System.out.println("Residents who find acceptable H0 and H2:");
    	
    	List<Hospital> target1 = Arrays.asList(h[0], h[2]); 	
    	residentList.stream()
    	 .filter(res1 -> resPrefMap.get(res1).containsAll(target1))
    	 .forEach(System.out::println);
    	
    	System.out.println("Hospitals that have R0 as their top preference: ");
    	hospitalSet.stream().filter(res -> hosPrefMap.get(res).indexOf(residentList.get(0)) == 0)
    	.forEach(System.out::println);
   	 
      
    } 

}
