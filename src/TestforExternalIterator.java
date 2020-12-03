import java.util.ArrayList;

import org.junit.Test;

import oops_assignments.Heap;
import oops_assignments.MaximumHeapBehavior;

import java.util.Iterator;
import oops_assignments.MinimumHeapBehavior;
import oops_assignments.OddFilter;

public class TestforExternalIterator {
	
	
	@Test
	public void testingExternalIteratorMaxHeap() {
		
		//Theme:testing the external Iterator functions for max heap

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

		for (Iterator<Integer> iter = maxHeap.iterator(); iter.hasNext();) {

			expectedResult.add(iter.next());
		}

		assert (expectedResult.equals(actualResult)) : "Test for External Iterator for max-heap failed";

	}


	@Test
	public void testingExternalIteratorMinHeap() {
		
		//Theme: Testing the external Iterator functions for min heap

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
		actualResult.add(99);
		actualResult.add(90);
		actualResult.add(65);
		actualResult.add(81);
		actualResult.add(45);
		actualResult.add(82);
		actualResult.add(72);
		actualResult.add(50);
		actualResult.add(96);

        ArrayList<Integer> expectedResult = new ArrayList<Integer>();
        
        //Using the iterator to get the values of heap in in-order

		for (Iterator<Integer> iter = minHeap.iterator(); iter.hasNext();) {

			expectedResult.add(iter.next());
		}
		
		assert (expectedResult.equals(actualResult)) : "Test for External Iterator for min heap failed";

	}

	@Test
	public void testingOddFilterIterator() {

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
		Iterator<Integer> iter = minHeap.iterator();
		OddFilter oddIterator = new OddFilter(iter);

		while (oddIterator.hasNext()) {
			int temp = oddIterator.next();
			System.out.println(temp);
			expectedResult.add(temp);
		}
		ArrayList<Integer> actualResult = new ArrayList<Integer>();
		actualResult.add(99);
		actualResult.add(65);
		actualResult.add(81);
		actualResult.add(45);


		assert (expectedResult.equals(actualResult)) : "Test for External Iterator failed";

	}

}
