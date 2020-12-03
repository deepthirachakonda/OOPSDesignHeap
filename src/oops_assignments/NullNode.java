package oops_assignments;

public class NullNode extends Node {

	@Override
	public boolean isNull() {
		return true;
	}

	@Override
	protected int getHeight() {
		return 0;
	}

	@Override
	public Node getLeft() {
		return null;
	}

	@Override
	public Node getRight() {
		return null;
	}

	@Override
	public Node getParent() {
		return null;
	}

	@Override
	public int getValue() {
		return 0;
	}

	@Override
	protected void setLeft(Node node) {
		// Stub
	}

	@Override
	protected void setRight(Node node) {
		// Stub
	}

	@Override
	protected void setParent(Node node) {
		// stub
	}

	@Override
	protected void setValue(int value) {
		// stub
	}

	@Override
	protected int getLeftHeight() {
		return 0;
	}

	@Override
	protected int getRightHeight() {
		return 0;
	}

}
