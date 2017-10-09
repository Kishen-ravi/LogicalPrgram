package ComparatorExample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HotelChecking {
	
	

	public static void main(String[] ags){
		
		HotelPOJO h1 = new HotelPOJO("hotel1",7,550);
		HotelPOJO h2 = new HotelPOJO("hotel2",8,500);
		HotelPOJO h3 = new HotelPOJO("hotel1",5,700);
		HotelPOJO h4 = new HotelPOJO("hotel1",5,560);
		HotelPOJO h5 = new HotelPOJO("hotel2",8,300);

		Set<HotelPOJO> set = new TreeSet<HotelPOJO>(new MyComparator());
		set.add(h1);
		set.add(h2);
		set.add(h3);
		set.add(h4);
		set.add(h5);
		Iterator iter = set.iterator();
		
		while(iter.hasNext()){
			HotelPOJO h = (HotelPOJO)iter.next();
			System.out.println("The hotel :"+h.getName()+" rating :"+h.getRating()+" cost :"+h.getCost());
		}
		
		
	}
}
