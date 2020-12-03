package oops_assignments;

/**
 * NodeFactory to create Real Node when the value is valid and Null Node when null value is passed
 *
 */
public class NodeFactory {
	public static Node createNode(Integer value) {
		if(value != null) {
			return new RealNode(value);
		}else {
			return new NullNode();
		}
	}
	//Intentional private constructor to avoid object creation for node factory
	private NodeFactory() {
		
	}
}
