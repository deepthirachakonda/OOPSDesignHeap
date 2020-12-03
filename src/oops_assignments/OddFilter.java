package oops_assignments;

import java.util.Iterator;

public class OddFilter {
	private Iterator<Integer> fullTreeIterator;
	private Integer nextValueInHeap = null;

	public OddFilter(Iterator<Integer> iterator) {
		this.fullTreeIterator = iterator;

		// finding the next odd value from the iterator and initializing iterator to
		// that odd value
		while (fullTreeIterator.hasNext()) {
			nextValueInHeap = fullTreeIterator.next();
			if (nextValueInHeap % 2 == 0) {
				continue;
			} else {
				break;
			}
		}
	}

	/**
	 * 
	 * @return true if heap has any odd value
	 */
	public boolean hasNext() {
		return (nextValueInHeap != null);
	}

	/**
	 * 
	 * @return odd value from the heap and move pointer to next odd value
	 */
	public int next() {
		Integer current = nextValueInHeap;
		// finding the next odd value from heap and assigning to nextValueInHeap and
		// returning current value at end
		while (fullTreeIterator.hasNext()) {
			int tempValue = fullTreeIterator.next();
			if (tempValue % 2 == 0) {
				nextValueInHeap = null;
				continue;
			} else {
				nextValueInHeap = tempValue;
				return current;
			}

		}
		return current;
	}
}
