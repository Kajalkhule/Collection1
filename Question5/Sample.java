package Question5;

import java.util.Collections;
import java.util.Vector;

public class Sample {

	public static void main(String[] args) {
		
        Vector<String> vec = new Vector<String>();
        vec.add("k");
        vec.add("a");
        vec.add("j");
        vec.add("a");
        vec.add("l");
   System.out.println("original vector : " + vec);
    Collections.sort(vec);
  System.out.println("sorted vector : " + vec);
    }

	}


