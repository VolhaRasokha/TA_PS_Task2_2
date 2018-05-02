package by.epam.ta.pa.task2_2.sets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set<Integer> treeSetList = new TreeSet<Integer>();
		Set<Integer> hashSetList = new HashSet<Integer>();
		
		CompareSets myTest = new CompareSets();
		long avaregeTimeTreeSet = myTest.compareSet(treeSetList);
		System.out.println("Avarege time for TreeSet: " + avaregeTimeTreeSet);
		
		long avaregeTimeHashSet = myTest.compareSet(hashSetList);
		System.out.println("Avarege Time for HashSet: " + avaregeTimeHashSet);
		
		if (avaregeTimeHashSet > avaregeTimeTreeSet){
			System.out.println("TreeSet is winner!");
		} else if (avaregeTimeHashSet == avaregeTimeTreeSet) {
			System.out.println("Avarege time is equals!");
		} else {System.out.println("HashSet is winner!");}
		
		
		System.out.println("");
		System.out.println("***************************************************");
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> LinkedList = new LinkedList<Integer>();
		
		long avaregeTimeArrayList = myTest.compareSet(arrayList);
		System.out.println("Avarege time for arrayList: " + avaregeTimeArrayList);
		
		long avaregeTimeLinkedList = myTest.compareSet(LinkedList);
		System.out.println("Avarege time for LinkedList: " + avaregeTimeLinkedList);
		
		if (avaregeTimeArrayList > avaregeTimeLinkedList){
			System.out.println("LinkedList is winner!");
		} else if (avaregeTimeArrayList == avaregeTimeLinkedList) {
			System.out.println("Avarege time is equals!");
		} else {System.out.println("ArrayList is winner!");}
		
		
		
		System.out.println("");
		System.out.println("***************************************************");
		Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
		
		long avaregeTimeHashMap = myTest.compareSet(hashMap);
		System.out.println("Avarege time for hashMap: " + avaregeTimeHashMap);
		
		long avaregeTimeTreeMap = myTest.compareSet(treeMap);
		System.out.println("Avarege time for TreeMap: " + avaregeTimeTreeMap);
		
		if (avaregeTimeHashMap > avaregeTimeTreeMap){
			System.out.println("TreeMap is winner!");
		} else if (avaregeTimeTreeMap == avaregeTimeHashMap) {
			System.out.println("Avarege time is equals!");
		} else {System.out.println("HashMap is winner!");}

	}

}
