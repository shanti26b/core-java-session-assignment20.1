package Assignment20;      // here i am creating package name as Assignment20

import java.util.HashMap;
import java.util.Iterator;

public class HashMapExample {          // here i am creating Class name as HashMapExample
	
	public static void main (String []args){
		
	HashMap<Integer,String> empNames =new HashMap<Integer,String>();
	
	// here i am  Adding values to HashMap ("keys", "values") we use .put method 
	
	empNames.put(111,"Komali");       // here i am adding Integer value 111 and String name as Komali
	empNames.put(115,"Varun");      // here i am adding Integer value 115 and String name as Varun
	empNames.put(113,"Mahe");      // here i am adding Integer value 113 and String name as Mahe
	empNames.put(133,"Fatima");      // here i am adding Integer value 133 and String name as Fatima
	empNames.put(190,"Sumith");     // here i am adding Integer value 190 and String name as Sumith
	empNames.put(200,"Ganesh");    // here i am adding Integer value 200 and String name as Ganesh
	
	 System.out.println("The EmpNames are : ");
	 
                 //	we are  using Iterator to get the values of the empNames 
	 
	Iterator valueIterator = empNames.values().iterator();
	
	while(valueIterator.hasNext()) {         // using while loop
	   
	 
	    System.out.println(valueIterator.next());     //this displays the empNmaes
	}
	
}

}

	

