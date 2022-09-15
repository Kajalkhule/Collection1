package Question4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sample {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<>();
		
		list.add("kajal");
		list.add("kajal");
		list.add("khule");
		list.add("pooja");
		list.add("komal");
		System.out.println(list);
		
        List<String> newList = list.stream()
                                      .distinct()
                                      .collect(Collectors.toList());
  
        // Print the ArrayList with duplicates removed
        System.out.println("ArrayList with duplicates removed: "
                           + newList);
        Collections.sort(newList);
        Collections.reverse(newList);
        System.out.println("decending  order : " + newList);
    
		
	}

}
