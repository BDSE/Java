/**
 * Maps- hashmap, treemap, linkedhashmap extends Map interface like lists extends List interface
 * hash map - cant reatain any order
 * tree map - retain natural order or ascending order in numbers and alphabetical order in strings
 * linkedHash map - uses double linked list and maintain the order in which you entered data
 */
package examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsExample {

	public static void main(String args[]) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

		// Another way to create the maps by using the generalised way which is
		// using Map interface as data type
		Map<Integer, String> hm1 = new HashMap<Integer, String>();
		Map<Integer, String> lhm1 = new LinkedHashMap<Integer, String>();
		Map<Integer, String> tm1 = new TreeMap<Integer, String>();

		String[] str = { "amar", "ammi", "orange", "cheekoo" };
		addDataToMaps(tm, str);
	}

	private static void addDataToMaps(Map<Integer, String> map, String[] data) {
		int key = 0;
		for (String s : data) {
			key++;
			map.put(key, s);
		}
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		for (Integer key1 : map.keySet()) {			
			System.out.println(key1 + "--" + map.get(key1));
		}
		Iterator<Integer> ie = map.keySet().iterator();
		System.out.println("from itertator interface applied on map");
		while (ie.hasNext()) {
			System.out.println(ie.next() +"="+ map.get(ie.next()));
		}
	}
}
