package Question1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Sample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(34);
		list.add(18);
		list.add(90);
		list.add(45);
		System.out.println( "list of integer"+list);
		
		Collections.sort(list);
		System.out.println("sort of list"+list);

	}

}
