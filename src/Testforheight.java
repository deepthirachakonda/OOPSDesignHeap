import org.junit.Test;

import oops_assignments.Heap;
import oops_assignments.MinimumHeapBehavior;

public class Testforheight {

	
	@Test
	public void testHeightInsertingThreeElement() {
		// Theme: Height when two and three elements inserted into min-heap should be constant
		Heap minHeap = new Heap(new MinimumHeapBehavior());
		minHeap.add(50);
		minHeap.add(60);
		int heightTwoElements = minHeap.getHeight();
		minHeap.add(40);
		int heightThreeElements = minHeap.getHeight();
		
		assert(heightTwoElements == heightThreeElements):"Height should not increase when third element is inserted";
		
	}
	
	@Test
	public void testInsertingFiveElement() {
		// Theme:Height should increase when fourth element is inserted.
		Heap minHeap = new Heap(new MinimumHeapBehavior());
		minHeap.add(50);
		minHeap.add(60);
		minHeap.add(40);
		int heightOfThreeElements = minHeap.getHeight();
		minHeap.add(60);
		int heightOfFourElements = minHeap.getHeight();
	
		
		assert(heightOfFourElements > heightOfThreeElements):"Height should increase when fourth element is inserted";
		
	}

}
