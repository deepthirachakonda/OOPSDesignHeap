import java.util.ArrayList;

import org.junit.Test;

import oops_assignments.Heap;
import oops_assignments.MaximumHeapBehavior;
import oops_assignments.MinimumHeapBehavior;
import oops_assignments.OddHeapdecorator;

public class TestForOddHeapDecorator {
	

	@Test
	public void testForToArrayMinHeap() {
		
		//Theme: test for Decorator toArray function for min heap
		
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

		// Known result
		ArrayList<Integer> expectedResult = new ArrayList<Integer>();
		expectedResult.add(99);
		expectedResult.add(65);
		expectedResult.add(81);
		expectedResult.add(45);
		
		// accessing toArray method of OddHeapDecorator by using oddHeap and storing result in actualResult
		OddHeapdecorator oddHeap = new OddHeapdecorator(minHeap);
		ArrayList<Integer> actualResult = new ArrayList<Integer>();
		
		Integer[] result = oddHeap.toArray();
		for(int n :result) {
			actualResult.add(n);
		}
		
		assert (expectedResult.equals(actualResult)):"Test for toArray in decorator class for min heap failed";
	}
	
	@Test
	public void testForToStringMinHeap() {
		
		//Theme: test for Decorator toString function for min heap
		
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

		// Known result
		String expectedResult="99 65 81 45";
		
		// accessing toString method of OddHeapDecorator by using oddHeap and storing result in actualResult
		OddHeapdecorator oddHeap = new OddHeapdecorator(minHeap);
		
		String actualResult = oddHeap.toString();
		
		assert (expectedResult.equals(actualResult)):"Test for toString() method in decorator class for min heap failed";
	}
	
	@Test
	public void testFortoArrayMaxHeap() {
		
		//Theme: test for Decorator toArray function for max heap
		
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

		// accessing toArray method of OddHeapDecorator by using oddHeap and storing result in actualResult
		OddHeapdecorator oddHeap = new OddHeapdecorator(maxHeap);
		ArrayList<Integer> actualResult = new ArrayList<Integer>();
		
		Integer[] result = oddHeap.toArray();
		for(int n :result) {
			actualResult.add(n);
		}
		assert (expectedResult.equals(actualResult)):"Test for toArray() method in decorator calss for max heap failed";
	}

	@Test
	public void testFortoStringMaxHeap() {
		
		//Theme: test for Decorator toArray function for max heap
		
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
        String expectedResult="45 81 99 65";
		
     // accessing toString method of OddHeapDecorator by using oddHeap and storing result in actualResult
		OddHeapdecorator oddHeap = new OddHeapdecorator(maxHeap);
		
		String actualResult = oddHeap.toString();
		
		assert (expectedResult.equals(actualResult)):"Test for toString Odd decorator for max heap failed";
	}


}
