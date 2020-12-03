import org.junit.Test;

import oops_assignments.Heap;
import oops_assignments.MinimumHeapBehavior;

public class TestForNode {

	@Test
	public void testInsertingRealNode() {
		// Theme: test for real node

		Heap minHeap = new Heap(new MinimumHeapBehavior());
		boolean expectedResult = minHeap.add(50);

		assert (expectedResult == true) : "Test inserting real node failed";
	}

	@Test
	public void testInsertingNullNode() {
		// Theme: test for null node

		Heap minHeap = new Heap(new MinimumHeapBehavior());
		boolean expectedResult = minHeap.add(null);

		assert (expectedResult == false) : "Test inserting real node failed";
	}

}
