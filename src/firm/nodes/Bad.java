/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Bad extends Node {
	static class Factory implements NodeWrapperFactory {
		@Override
		public Node createWrapper(Pointer ptr) {
			return new Bad(ptr);
		}
	}

	static void init() {
		Pointer op = firm.bindings.binding_irnode.get_op_Bad();
		Node.registerFactory(firm.bindings.binding_irop.get_op_code(op), new Factory());
	}

	public Bad(Pointer ptr) {
		super(ptr);
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}
