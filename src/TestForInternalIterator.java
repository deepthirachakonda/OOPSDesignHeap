import java.util.ArrayList;
import org.junit.Test;

import oops_assignments.Heap;
import oops_assignments.MaximumHeapBehavior;
import oops_assignments.MinimumHeapBehavior;

public class TestForInternalIterator {

	@Test
	public void testingForInternalIteratorMinHeap() {
		
		//Theme: testing internal Iterator for min heap

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

		ArrayList<Integer> expectedResult = new ArrayList<Integer>();

		ArrayList<Integer> actualResult = new ArrayList<Integer>();
		actualResult.add(99);
		actualResult.add(90);
		actualResult.add(65);
		actualResult.add(81);
		actualResult.add(45);
		actualResult.add(82);
		actualResult.add(72);
		actualResult.add(50);
		actualResult.add(96);
		
		
		minHeap.forEach((Integer t) -> expectedResult.add(t));
//		minHeap.forEach((Node t) -> {t.getValue() = t.getValue()*3;});
//		minHeap.forEach((Node t) -> System.out.println("After "+t.getValue()));


		assert (expectedResult.equals(actualResult)) : "Test for Internal Iterator for min-heap failed";

	}
	
	@Test
	public void testingInternalIteratorMaxHeap() {
		
		//Theme:testing the Internal Iterator functions for max heap

		Heap maxHeap = new Heap(new MaximumHeapBehavior());
		maxHeap.add(50);
		maxHeap.add(60);
		maxHeap.add(70);
		
		ArrayList<Integer> actualResult = new ArrayList<Integer>();
		actualResult.add(50);
		actualResult.add(70);
		actualResult.add(60);

		ArrayList<Integer> expectedResult = new ArrayList<Integer>();
		
		//Using the iterator to get the values of heap in in-order

		maxHeap.forEach((Integer t) -> expectedResult.add(t));
		
		assert (expectedResult.equals(actualResult)) : "Test for Internal Iterator for max-heap failed";

	}


}
