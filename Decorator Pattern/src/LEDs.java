
public class LEDs extends TreeDecorator {
	Tree tree;

	public LEDs(Tree tree) {
		this.tree = tree;
	}
	
	public String getDescription() {
		return tree.getDescription() + ", LEDs";
	}
	
	public double cost() {
		return 10.00 + tree.cost();
	}
}
