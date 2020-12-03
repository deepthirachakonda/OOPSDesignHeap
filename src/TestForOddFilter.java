import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

import oops_assignments.Heap;
import oops_assignments.MaximumHeapBehavior;
import oops_assignments.MinimumHeapBehavior;
import oops_assignments.OddFilter;

public class TestForOddFilter {

	@Test
	public void testingOddFilterIteratorMinHeap() {
		
		//theme: testing odd filter for min heap

		Heap minHeap = new Heap(new MinimumHeapBehavior());
		minHeap.add(45);
		minHeap.add(65);
		minHeap.add(72);
		minHeap.add(90);
		minHeap.add(82);
		minHeap.add(81);
		minHeap.add(99);
		minHeap.add(96);
		minHeap.add(50);

		ArrayList<Integer> actualResult = new ArrayList<Integer>();
		Iterator<Integer> iter = minHeap.iterator();
		OddFilter oddIterator = new OddFilter(iter);

		while (oddIterator.hasNext()) {
			int temp = oddIterator.next();
			actualResult.add(temp);
		}
		ArrayList<Integer> expectedResult = new ArrayList<Integer>();
		expectedResult.add(99);
		expectedResult.add(65);
		expectedResult.add(81);
		expectedResult.add(45);

		assert (expectedResult.equals(actualResult)) : "Test for odd filter using min heap failed";

	}
	
	@Test
	public void testingOddFilterIteratorMaxHeap() {
		
		//Theme :testing odd filter for max heap
		
		Heap maxHeap = new Heap(new MaximumHeapBehavior());
		maxHeap.add(45);
		maxHeap.add(65);
		maxHeap.add(72);
		maxHeap.add(90);
		maxHeap.add(82);
		maxHeap.add(81);
		maxHeap.add(99);
		maxHeap.add(96);
		maxHeap.add(50);

		// Known result
		ArrayList<Integer> expectedResult = new ArrayList<Integer>();
		expectedResult.add(45);
		expectedResult.add(81);
		expectedResult.add(99);
		expectedResult.add(65);

		// Because we need a way to verify insertion is successful we need one form of
		// order traversal, existing toArray() method return array of nodes in in-order
		
		ArrayList<Integer> actualResult = new ArrayList<Integer>();
		Iterator <Integer> iter = maxHeap.iterator();
		OddFilter oddIterator=new OddFilter(iter);
		
		while(oddIterator.hasNext()) {
			int temp =oddIterator.next();
			actualResult.add(temp);
		}
		
		assert (expectedResult.equals(actualResult)):"Elements for odd filter using max heap failed";
	}

}
