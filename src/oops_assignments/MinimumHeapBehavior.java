package oops_assignments;

public class MinimumHeapBehavior implements HeapBehavior {
	
	public void add(Node newNode, Node currentRoot) {
		// Recursion base case
		// when 'currentRoot' is a leaf node or a root (left and right height is zero)
		if (currentRoot.getLeft().isNull() && currentRoot.getRight().isNull()) {
			if (newNode.getValue() < currentRoot.getValue()) {
				int swap = currentRoot.getValue();
				currentRoot.setValue(newNode.getValue());
				newNode.setValue(swap);
				currentRoot.setLeft(newNode);
				newNode.setParent(currentRoot);
			} else {
				currentRoot.setLeft(newNode);
				newNode.setParent(currentRoot);
			}
			return;
		}

		// Insert new node value at the correct position (x) and take the existing value
		// at position x and
		// recursively find its position in the tree
		if (newNode.getValue() < currentRoot.getValue()) {
			int swap = currentRoot.getValue();
			currentRoot.setValue(newNode.getValue());
			newNode.setValue(swap);
		}

		int leftHeight = currentRoot.getLeftHeight();
		int rightHeight = currentRoot.getRightHeight();
		// If right tree height is zero insert new node to the right of the currentRoot
		if (rightHeight == 0) {
			currentRoot.setRight(newNode);
			newNode.setParent(currentRoot);
			return;
		}

		// Recursively find the current 'newNode' position according to left and right
		// subtree heights
		if (leftHeight <= rightHeight) {
			this.add(newNode, currentRoot.getLeft());
		} else {
			this.add(newNode, currentRoot.getRight());
		}

	}

}
