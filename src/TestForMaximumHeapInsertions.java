import java.util.ArrayList;

import org.junit.Test;

import oops_assignments.Heap;
import oops_assignments.MaximumHeapBehavior;

public class TestForMaximumHeapInsertions {

	@Test
	public void testForElementsIncreasingOrder() {
		
		//Theme:Testing max-heap by inserting elements in increasing order.
		Heap maxHeap = new Heap(new MaximumHeapBehavior());
		maxHeap.add(50);
		maxHeap.add(60);
		maxHeap.add(70);
		
		//known result
		ArrayList<Integer> expectedResult = new ArrayList<Integer>();
		expectedResult.add(50);
		expectedResult.add(70);
		expectedResult.add(60);
		
		// Because we need a way to verify insertion is successful we need one form of
		// order traversal, existing toArray() method return array of nodes in in-order
		
		ArrayList<Integer> actualResult = new ArrayList<Integer>();
		
		Integer[] result = maxHeap.toArray();
		for(int n :result) {
			actualResult.add(n);
		}
		
		assert (expectedResult.equals(actualResult)):"Inserting elements for maxheap in increasing order test failed";	
		
	}

	@Test
	public void testForElementsDecreasingOrder() {
		
		//Theme:Testing max-heap by inserting elements in increasing order.
		Heap maxHeap = new Heap(new MaximumHeapBehavior());
		maxHeap.add(100);
		maxHeap.add(90);
		maxHeap.add(80);
		
		//known result
		ArrayList<Integer> expectedResult = new ArrayList<Integer>();
		expectedResult.add(90);
		expectedResult.add(100);
		expectedResult.add(80);
		
		// Because we need a way to verify insertion is successful we need one form of
		// order traversal, existing toArray() method return array of nodes in in-order
		
		ArrayList<Integer> actualResult = new ArrayList<Integer>();
		
		Integer[] result = maxHeap.toArray();
		for(int n :result) {
			actualResult.add(n);
		}
		
		assert (expectedResult.equals(actualResult)):"Inserting elements for maxheap in decreasing order test failed";	
		
	}
	
	@Test
	public void testRandomOrderElements() {
		//Theme :Elements inserting in random order.
		
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
		expectedResult.add(90);
		expectedResult.add(72);
		expectedResult.add(99);
		expectedResult.add(50);
		expectedResult.add(65);
		expectedResult.add(96);
		expectedResult.add(82);

		// Because we need a way to verify insertion is successful we need one form of
		// order traversal, existing toArray() method return array of nodes in in-order
		
		ArrayList<Integer> actualResult = new ArrayList<Integer>();
		Integer[] result = maxHeap.toArray();
		for(int n : result) {
			actualResult.add(n);
		}
		assert (expectedResult.equals(actualResult)):"Elements inserting in random order failed";
	}
	
	@Test
	public void testElementsWithZeros() {
		//Theme : Elements with zeros in middle.
		Heap maxHeap = new Heap(new MaximumHeapBehavior());
		maxHeap.add(35);
		maxHeap.add(0);
		maxHeap.add(90);
		maxHeap.add(0);
		maxHeap.add(20);
		maxHeap.add(0);

		// Known result
		ArrayList<Integer> expectedResult = new ArrayList<Integer>();
		expectedResult.add(0);
		expectedResult.add(0);
		expectedResult.add(0);
		expectedResult.add(90);
		expectedResult.add(20);
		expectedResult.add(35);

		// Because we need a way to verify insertion is successful we need one form of
		// order traversal, existing toArray() method return array of nodes in in-order
		
		ArrayList<Integer> actualResult = new ArrayList<Integer>();
		Integer[] result = maxHeap.toArray();
		for(int n : result) {
			actualResult.add(n);
		}
		assert (expectedResult.equals(actualResult)):"Elements with Zeros in the middle failed";
	}
	
	@Test
	public void testElementsWithNegitives() {
		// Theme : Elements with negative values.
		
		Heap maxHeap = new Heap(new MaximumHeapBehavior());
		maxHeap.add(45);
		maxHeap.add(-65);
		maxHeap.add(72);
		maxHeap.add(-90);
		maxHeap.add(82);
		maxHeap.add(-81);
		maxHeap.add(99);
		maxHeap.add(96);

		// Known result
		ArrayList<Integer> expectedResult = new ArrayList<Integer>();
		expectedResult.add(-90);
		expectedResult.add(-65);
		expectedResult.add(82);
		expectedResult.add(-81);
		expectedResult.add(99);
		expectedResult.add(45);
		expectedResult.add(96);
		expectedResult.add(72);

		// Because we need a way to verify insertion is successful we need one form of
		// order traversal, existing toArray() method return array of nodes in in-order
		
		ArrayList<Integer> actualResult = new ArrayList<Integer>();
		Integer[] result = maxHeap.toArray();
		for(int n : result) {
			actualResult.add(n);
		}
		assert (expectedResult.equals(actualResult)):"Negitive elements inserting test failed";
	}


}
