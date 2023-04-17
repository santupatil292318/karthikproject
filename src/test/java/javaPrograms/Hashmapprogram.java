package javaPrograms;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmapprogram {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(2,"santosh");
		map.put(1,"patil");
		map.put(3,"ningadalli");
		for (Entry<Integer, String> e : map.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}

	}

}
