package oops_assignments;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * 
 * TODO: swap reuse, reorg if any, comments, documentation Remove print
 * functions
 */

public class Heap extends AbstractQueue<Integer> {

	// Default Heap behavior is 'MinHeap' (if user fails to define a behavior)
	private HeapBehavior heapBehavior = new MinimumHeapBehavior();
	private int size = 0;
	private Node root = new NullNode();


	/**
	 * Constructs an empty Heap with a behavior
	 * @param heapBehavior: Min or Max behavior
	 */
	public Heap(HeapBehavior heapBehavior) {
		if(heapBehavior != null) {
			this.heapBehavior = heapBehavior;
		}
	}

	/**
	 * Constructs Heap with a list of integers and a take in a behavior
	 * @param listOfValues: Array of input values
	 * @param heapBehaviour: Min or Max behavior
	 */
	public Heap(int[] listOfValues, HeapBehavior heapBehavior) {
		if(heapBehavior != null) {
			this.heapBehavior = heapBehavior;
		}
		for (int idx = 0; idx < listOfValues.length; idx++) {
			this.add(listOfValues[idx]);
		}
	}

	/**
	 * Internal iterator that takes a lambda of signature which returns void and takes Integer as
	 * its argument.
	 */
	@Override
	public void forEach(Consumer<? super Integer> action) {
		HeapIterator heapIterator = new HeapIterator(root);
		for (Iterator<Integer> iterator = heapIterator.getIterator(); iterator.hasNext();) {
			action.accept(iterator.next());
		}
	}

	/**
	 * 
	 * Add an integer value to the Heap
	 * 
	 * @param value: Integer value to be inserted
	 */
	@Override
	public boolean add(Integer value) {
		Node newNode = NodeFactory.createNode(value);
		if (newNode.isNull())
			return false;
		size++;
		if (root.isNull()) {
			root = newNode;
			return true;
		}
		this.heapBehavior.add(newNode, root);
		return true;
	}

	/**
	 * Function for the user to query the height of Heap.
	 * 
	 * @return height of MinHeap
	 */
	public int getHeight() {
		if (root.isNull())
			return -1;

		return root.getHeight();
	}

	/**
	 * returns String of element values in "In-order".
	 */

	@Override
	public String toString() {
		HeapIterator heapIterator = new HeapIterator(root);
		String strCache = "";
		for (Iterator<Integer> iter = heapIterator.getIterator(); iter.hasNext();) {
			strCache += iter.next() + " ";
		}
		return strCache.trim();
	}

	/**
	 * returns Array of integers of heap in "In-order".
	 */

	@Override
	public Integer[] toArray() {
		HeapIterator heapIterator = new HeapIterator(root);
		Integer[] nodeCache = new Integer[size];
		int index = 0;
		for (Iterator<Integer> iter = heapIterator.getIterator(); iter.hasNext();) {
			nodeCache[index++] = iter.next();
		}
		return nodeCache;
	}

	/**
	 * returns Iterator for the heap which can traverse the heap values in
	 * "In-order"
	 */
	@Override
	public Iterator<Integer> iterator() {
		HeapIterator heapIterator = new HeapIterator(root);
		return (Iterator<Integer>) heapIterator.getIterator();
	}

	/**
	 * returns the no. of elements in the heap
	 */

	@Override
	public int size() {
		return size;
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
