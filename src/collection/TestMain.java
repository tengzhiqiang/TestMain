package collection;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.junit.jupiter.api.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

class TestMain {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test_listSort() {
		System.out.println("ceshi ");
	}
	
	
	
	@Test
	public void test_CollectionSort() {//普通map按照升序排列
		
		Map<String, Object> hashMap = new HashMap<>();
		hashMap.put("1", "1");
		hashMap.put("6", "6");
		hashMap.put("3", "3");
		hashMap.put("4", "4");
		hashMap.put("2", "2");
		hashMap.put("5", "5");
		
		for (Entry<String, Object> entry : hashMap.entrySet()) {
			System.out.println("hashMap:key="+entry.getKey()+",value="+entry.getValue());
		}
		TreeMap<String, Object> teMap = new TreeMap<>();
		

		teMap.putAll(hashMap);
//		teMap = (TreeMap<String, Object>) teMap.descendingMap();
		for (String key : teMap.keySet()) {
			System.out.println("key="+key+",value= "+teMap.get(key));
		}
	}
	@Test
	public void test_CollectionSort_Asc() {//降序排列
		/**
		 * 
		 * 
		 */
		Map<String, Object> hashMap = new HashMap<>();
		hashMap.put("1", "1");
		hashMap.put("6", "6");
		hashMap.put("3", "3");
		hashMap.put("4", "4");
		hashMap.put("2", "2");
		hashMap.put("5", "5");
		
		for (Entry<String, Object> entry : hashMap.entrySet()) {
			System.out.println("hashMap:key="+entry.getKey()+",value="+entry.getValue());
		}
		/**
		 * 1.new TreeMap<>(Collections.reverseOrder())，treeMap是默认是升序排列，而Collections.reverseOrder()是顺序反过来，
		 */
		TreeMap<String, Object> teMap = new TreeMap<>(Collections.reverseOrder());//Collections.reverseOrder()
		
		/**
		 * 2.new Comparator<String>()比较器，正数=前面大于后面，0=两个数相等，复数=后面大于前面
		 */
		TreeMap<String, Object> teMap1 = new TreeMap<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		});//Comparator
		

		List<Entry<String, Object> > list = new ArrayList<>(hashMap.entrySet());
		
		
		teMap1.putAll(hashMap);
		for (String key : teMap1.keySet()) {
			System.out.println("key="+key+",value= "+teMap1.get(key));
		}
	}

}
