package oops_assignments;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class HeapIterator implements Container {

	private Node root;

	HeapIterator(Node root) {
		this.root = root;
	}

	/**
	 * returns iterator object of HeapIteratorImpl
	 */

	@Override
	public Iterator<Integer> getIterator() {
		// find left most here left
		Node leftMost = root;
		if (root.isNull())
			return null;

		// traversing to the entire left side of the heap to get leftmost value
		while (!leftMost.getLeft().isNull()) {
			leftMost = leftMost.getLeft();
		}
		return new HeapIteratorImpl(leftMost);
	}

	private class HeapIteratorImpl implements Iterator<Integer> {

		private Node nextNode;

		HeapIteratorImpl(Node leftMost) {
			nextNode = leftMost;
		}

		/**
		 * checks if the heap has any value
		 */
		@Override
		public boolean hasNext() {
			return (!nextNode.isNull());
		}

		/**
		 * returns the next value of the heap
		 */
		@Override
		public Integer next() {
			if (!hasNext())
				throw new NoSuchElementException();
			Node current = nextNode;
			if (hasNext()) {
				if (!nextNode.getRight().isNull()) {
					nextNode = nextNode.getRight();

					// move to the leftmost node of the right sub tree
					while (!nextNode.getLeft().isNull()) {
						nextNode = nextNode.getLeft();
					}
					return current.getValue();
				}

				else
					while (true) {
						// case where the next node is root and reached from the right sub tree
						if (nextNode.getParent().isNull()) {
							nextNode = new NullNode();
							return current.getValue();
						}
						// left side of heap which is already accessed so moving to
						// the parent until we reach the non accessed value.
						if (nextNode.getParent().getLeft() == nextNode) {
							nextNode = nextNode.getParent();
							return current.getValue();
						}
						nextNode = nextNode.getParent();
					}
			}
			return current.getValue();

		}

	}

}
