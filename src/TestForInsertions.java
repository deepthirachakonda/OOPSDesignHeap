import java.util.ArrayList;

import org.junit.Test;
import oops_assignments.Heap;
import oops_assignments.MinimumHeapBehavior;

public class TestForInsertions {

	@Test
	public void testIncreasingOrderedElements() {
		//Theme: Testing by inserting elements in increasing order.
		Heap minHeap = new Heap(new MinimumHeapBehavior());
		minHeap.add(50);
		minHeap.add(60);
		minHeap.add(70);

		// Known result
		ArrayList<Integer> expectedResult = new ArrayList<Integer>();
		expectedResult.add(60);
		expectedResult.add(50);
		expectedResult.add(70);

		// Because we need a way to verify insertion is successful we need one form of
		// order traversal, existing toArray() method return array of nodes in in-order
		ArrayList<Integer> actualResult = new ArrayList<Integer>();
		Integer[] result = minHeap.toArray();
		for(int n : result) {
			actualResult.add(n);
		}	
		assert (expectedResult.equals(actualResult)):"Elements increasing order test failed";
	}

	@Test
	public void testInsertingFirstElement() {
		//Theme: Testing by inserting only one element.
		
		Heap minHeap = new Heap(new MinimumHeapBehavior());
		minHeap.add(50);

		// Known result
		ArrayList<Integer> expectedResult = new ArrayList<Integer>();
		expectedResult.add(50);

		// Because we need a way to verify insertion is successful we need one form of
		// order traversal,  existing toArray() method return array of nodes in in-order
		ArrayList<Integer> actualResult = new ArrayList<Integer>();
		Integer[] result = minHeap.toArray();
		for(int n : result) {
			actualResult.add(n);
		}
		assert (expectedResult.equals(actualResult)):"one Element inserting failed";
	}

	@Test
	public void testDecreasingOrderedElements() {
		//Theme : Testing by inserting elements in decreasing order.
		
		Heap minHeap = new Heap(new MinimumHeapBehavior());
		minHeap.add(50);
		minHeap.add(40);
		minHeap.add(30);
		minHeap.add(20);
		minHeap.add(10);

		// Known result
		ArrayList<Integer> expectedResult = new ArrayList<Integer>();
		expectedResult.add(50);
		expectedResult.add(30);
		expectedResult.add(10);
		expectedResult.add(40);
		expectedResult.add(20);

		// Because we need a way to verify insertion is successful we need one form of
		// order traversal,  existing toArray() method return array of nodes in in-order
		
		ArrayList<Integer> actualResult = new ArrayList<Integer>();
		Integer[] result = minHeap.toArray();
		for(int n : result) {
			actualResult.add(n);
		}
		assert (expectedResult.equals(actualResult)):"Elements inserting in decreasing order failed";
	}

	@Test
	public void testRandomOrderElements() {
		//Theme :Elements inserting in random order.
		
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
		expectedResult.add(90);
		expectedResult.add(65);
		expectedResult.add(81);
		expectedResult.add(45);
		expectedResult.add(82);
		expectedResult.add(72);
		expectedResult.add(50);
		expectedResult.add(96);

		// Because we need a way to verify insertion is successful we need one form of
		// order traversal, existing toArray() method return array of nodes in in-order
		
		ArrayList<Integer> actualResult = new ArrayList<Integer>();
		Integer[] result = minHeap.toArray();
		for(int n : result) {
			actualResult.add(n);
		}
		assert (expectedResult.equals(actualResult)):"Elements inserting in random order failed";
	}

	@Test
	public void testElementswithSameValue() {
		// Theme : Inserting elements with same value.
		Heap minHeap = new Heap(new MinimumHeapBehavior());
		minHeap.add(35);
		minHeap.add(35);
		minHeap.add(90);
		minHeap.add(90);
		minHeap.add(20);
		minHeap.add(20);

		// Known result
		ArrayList<Integer> expectedResult = new ArrayList<Integer>();
		expectedResult.add(90);
		expectedResult.add(20);
		expectedResult.add(35);
		expectedResult.add(20);
		expectedResult.add(90);
		expectedResult.add(35);

		// Because we need a way to verify insertion is successful we need one form of
		// order traversal, existing toArray() method return array of nodes in in-order
		
		ArrayList<Integer> actualResult = new ArrayList<Integer>();
		Integer[] result = minHeap.toArray();
		for(int n : result) {
			actualResult.add(n);
		}
		assert (expectedResult.equals(actualResult)):"Elements inserting with same value test failed";
	}

	@Test
	public void testElementsWithZeros() {
		//Theme : Elements with zeros in middle.
		Heap minHeap = new Heap(new MinimumHeapBehavior());
		minHeap.add(35);
		minHeap.add(0);
		minHeap.add(90);
		minHeap.add(0);
		minHeap.add(20);
		minHeap.add(0);

		// Known result
		ArrayList<Integer> expectedResult = new ArrayList<Integer>();
		expectedResult.add(35);
		expectedResult.add(0);
		expectedResult.add(0);
		expectedResult.add(0);
		expectedResult.add(90);
		expectedResult.add(20);

		// Because we need a way to verify insertion is successful we need one form of
		// order traversal, existing toArray() method return array of nodes in in-order
		
		ArrayList<Integer> actualResult = new ArrayList<Integer>();
		Integer[] result = minHeap.toArray();
		for(int n : result) {
			actualResult.add(n);
		}
		assert (expectedResult.equals(actualResult)):"Elements with Zeros in the middle failed";
	}
	@Test
	public void testElementsWithNegitives() {
		// Theme : Elements with negative values.
		
		Heap minHeap = new Heap(new MinimumHeapBehavior());
		minHeap.add(45);
		minHeap.add(-65);
		minHeap.add(72);
		minHeap.add(-90);
		minHeap.add(82);
		minHeap.add(-81);
		minHeap.add(99);
		minHeap.add(96);

		// Known result
		ArrayList<Integer> expectedResult = new ArrayList<Integer>();
		expectedResult.add(99);
		expectedResult.add(45);
		expectedResult.add(-81);
		expectedResult.add(-65);
		expectedResult.add(-90);
		expectedResult.add(82);
		expectedResult.add(72);
		expectedResult.add(96);

		// Because we need a way to verify insertion is successful we need one form of
		// order traversal, existing toArray() method return array of nodes in in-order
		
		ArrayList<Integer> actualResult = new ArrayList<Integer>();
		Integer[] result = minHeap.toArray();
		for(int n : result) {
			actualResult.add(n);
		}
		assert (expectedResult.equals(actualResult)):"Negitive elements inserting test failed";
	}
	@Test
	public void testOfMinHeapConstructor2() {
		// Theme : Testing min heap constructor 2 which is used to insert more than one elements at a time.
		
		int[] arr = new int[] {45,-65,72,-90,82,-81,99,96};
		Heap minHeap = new Heap(arr,new MinimumHeapBehavior());

		// Known result
		ArrayList<Integer> expectedResult = new ArrayList<Integer>();
		expectedResult.add(99);
		expectedResult.add(45);
		expectedResult.add(-81);
		expectedResult.add(-65);
		expectedResult.add(-90);
		expectedResult.add(82);
		expectedResult.add(72);
		expectedResult.add(96);

		// Because we need a way to verify insertion is successful we need one form of
		// order traversal, existing toArray() method return array of nodes in in-order
		
		ArrayList<Integer> actualResult = new ArrayList<Integer>();
		Integer[] result = minHeap.toArray();
		for(int n : result) {
			actualResult.add(n);
		}
		assert (expectedResult.equals(actualResult)):"Inserting multiple elements test failed";
	}
	
	@Test
	public void testIfTheBehaviorIsNull() {
		//Theme: Testing if the heapBehavior is passed as null
		Heap minHeap = new Heap(null);
		minHeap.add(50);
		minHeap.add(60);
		minHeap.add(70);

		// Known result
		ArrayList<Integer> expectedResult = new ArrayList<Integer>();
		expectedResult.add(60);
		expectedResult.add(50);
		expectedResult.add(70);

		// Because we need a way to verify insertion is successful we need one form of
		// order traversal, existing toArray() method return array of nodes in in-order
		ArrayList<Integer> actualResult = new ArrayList<Integer>();
		Integer[] result = minHeap.toArray();
		for(int n : result) {
			actualResult.add(n);
		}	
		assert (expectedResult.equals(actualResult)):"Test failed for default Behavioue";
	}
}
