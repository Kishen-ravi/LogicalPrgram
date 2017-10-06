package logicalPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapKeys {

	public static void main(String[] ags){
		HashMap<String, String> unsortedMap=new HashMap<>();
		unsortedMap.put("101", "Indhu");
		unsortedMap.put("102", "Pandi");
		unsortedMap.put("103", "Benson");
		unsortedMap.put("104", "Midhun");
		System.out.println("Unsorted map is:");
		for(Map.Entry<String, String> s :unsortedMap.entrySet()){
			System.out.print(s+" ");
		}
		System.out.println("");
		System.out.println("Sorted Map");
		TreeMap<String, String> sortedMap=new TreeMap<>(unsortedMap);
		System.out.println(sortedMap);
		
		
		String s ="sugan";
		System.out.println("string:"+s.getClass().getDeclaredFields());
		StringBuffer sb = new StringBuffer("suganth");
		System.out.println("stringbuffer :"+sb);
	}
}
