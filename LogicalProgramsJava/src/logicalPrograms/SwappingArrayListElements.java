package logicalPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class SwappingArrayListElements {

	public static void main(String[] ags){
		ArrayList arrayList=new ArrayList();
		arrayList.add("Midhun");
		arrayList.add("Benson");
		arrayList.add("Pandi");
		arrayList.add("Indhu");
		System.out.println("Before Swaping the content"+arrayList);
		Collections.swap(arrayList, 0, 2);
		System.out.println(arrayList);
	}
}
