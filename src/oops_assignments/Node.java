package oops_assignments;

public abstract class Node {
	public abstract boolean isNull();

	protected abstract int getHeight();

	public abstract Node getLeft();

	public abstract Node getRight();

	public abstract Node getParent();

	public abstract int getValue();

	protected abstract void setLeft(Node node);

	protected abstract void setRight(Node node);

	protected abstract void setParent(Node node);

	protected abstract void setValue(int value);

	protected abstract int getLeftHeight();

	protected abstract int getRightHeight();

}
