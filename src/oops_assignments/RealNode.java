package oops_assignments;

/**
 * Structure of a MinHeap Node using Left and Right pointers.
 *
 */
public class RealNode extends Node { // TODO Private or public
	Node left;
	Node right;
	Node parent;
	public int val;

	// ---------------------------public methods of RealNode----------------------/

	/**
	 * getter method to get left node
	 */
	public Node getLeft() {
		return left;
	}

	/**
	 * getter method to get right node
	 */
	public Node getRight() {
		return right;
	}

	/**
	 * getter method to get parent node
	 */
	public Node getParent() {
		return parent;
	}

	/**
	 * getter method to get value of node
	 */
	public int getValue() {
		return val;
	}

	public RealNode(int data) {
		this.left = new NullNode();
		this.right = new NullNode();
		this.parent = new NullNode();
		val = data;
	}

	/**
	 * getter method to get left height of the node
	 */
	@Override
	public int getLeftHeight() {
		if (left.isNull())
			return 0;
		return left.getHeight();
	}

	/**
	 * getter method to get Right height of the node.
	 */
	@Override
	public int getRightHeight() {
		if (right.isNull())
			return 0;
		return right.getHeight();
	}

	/**
	 * Public method that finds height of tree from current Node
	 *
	 */
	public int getHeight() {
		return 1 + Math.max(getLeftHeight(), getRightHeight());
	}

	/**
	 * returns false if the node is not null
	 */
	@Override
	public boolean isNull() {
		return false;
	}
	
	// ---------------------------public methods end---------------------------/


	/**
	 * setter method to set the value of left node
	 */
	@Override
	protected void setLeft(Node node) {
		this.left = node;
	}

	/**
	 * setter method to set the value of right node
	 */
	@Override
	protected void setRight(Node node) {
		this.right = node;
	}

	/**
	 * setter method to set the value of parent node
	 */
	@Override
	protected void setParent(Node node) {
		this.parent = node;
	}

	/**
	 * setter method to set the value of node
	 */
	@Override
	protected void setValue(int value) {
		this.val = value;
	}
}
