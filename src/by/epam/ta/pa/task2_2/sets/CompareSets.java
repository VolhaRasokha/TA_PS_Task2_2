package by.epam.ta.pa.task2_2.sets;


import java.util.List;
import java.util.Map;
import java.util.Set;

public class CompareSets {
	
	public CompareSets(){
	}

	public long compareSet(Set<Integer> setList) {
		int count = 0;
		long avarageResult = 0;
		for (int i = 0; i < 3; i++) {
			long startTimeTree = System.currentTimeMillis();
			addElements(setList);
			long stopTimeTree = System.currentTimeMillis();
			count = count + 1;
			long executionTimeTree = stopTimeTree - startTimeTree;
			avarageResult = (avarageResult + executionTimeTree) / count;
		}
		return avarageResult;
	}
	
	public long compareSet(List<Integer> setList) {
		int count = 0;
		long avarageResult = 0;
		for (int i = 0; i < 3; i++) {
			long startTimeTree = System.currentTimeMillis();
			addElements(setList);
			long stopTimeTree = System.currentTimeMillis();
			count = count + 1;
			long executionTimeTree = stopTimeTree - startTimeTree;
			avarageResult = (avarageResult + executionTimeTree) / count;
		}
		return avarageResult;
	}
	
	public long compareSet(Map<Integer, Integer> setList) {
		int count = 0;
		long avarageResult = 0;
		for (int i = 0; i < 3; i++) {
			long startTimeTree = System.currentTimeMillis();
			addElements(setList);
			long stopTimeTree = System.currentTimeMillis();
			count = count + 1;
			long executionTimeTree = stopTimeTree - startTimeTree;
			avarageResult = (avarageResult + executionTimeTree) / count;
		}
		return avarageResult;
	}

	public void addElements(Set<Integer> setList) {
		for (int i = 0; i < 600000; i++) {
			setList.add(i);
		}
	}
	
	public void addElements(List<Integer> setList) {
		for (int i = 0; i < 600000; i++) {
			setList.add(i);
		}
	}
	
	public void addElements(Map<Integer,Integer> setList) {
		for (int i = 0; i < 600000; i++) {
			setList.put(i,i);
		}
	}
}
