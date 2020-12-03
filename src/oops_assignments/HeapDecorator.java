package oops_assignments;

import java.util.AbstractQueue;

/**
 * This is an abstract class that would wrap around heap class to modify the heap
 * OddheapDecorator class would extend this class to modify toArray and toString
 * methods
 *
 */
public abstract class HeapDecorator extends AbstractQueue<Integer> {

	public abstract Integer[] toArray();

	public abstract String toString();

}
