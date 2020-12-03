package oops_assignments;

import java.util.ArrayList;
import java.util.Iterator;

public class OddHeapdecorator extends HeapDecorator {

	Heap heap;

	public OddHeapdecorator(Heap heap) {
		this.heap = heap;
	}

	/**
	 * returns list of odd values from the heap
	 */
	@Override
	public Integer[] toArray() {
		Integer[] arrayFromHeap = this.heap.toArray();

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		int index = 0;
		for (int element : arrayFromHeap) {
			if (element % 2 != 0) {
				arrayList.add(element);
			}
		}
		Integer[] oddArray = new Integer[arrayList.size()];
		for (int element : arrayList) {
			oddArray[index++] = element;
		}

		return oddArray;
	}

	/**
	 * returns string of odd values with space as delimiter from the heap
	 */
	@Override
	public String toString() {
		String stringFromHeap = this.heap.toString();
		String[] strArray = stringFromHeap.split(" ");
		String oddStr = "";
		for (String subStr : strArray) {
			if (Integer.parseInt(subStr) % 2 != 0) {
				oddStr += subStr + " ";
			}
		}
		return oddStr.trim();
	}

	/**
	 * return Iterator which can traverse through only odd values
	 */
	@Override
	public Iterator<Integer> iterator() {
		Iterator<Integer> iter = this.heap.iterator();
		return (Iterator<Integer>) new OddFilter(iter);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean offer(Integer e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Integer poll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer peek() {
		// TODO Auto-generated method stub
		return null;
	}
}
