
public class Ribbons extends TreeDecorator {
	Tree tree;

	public Ribbons(Tree tree) {
		this.tree = tree;
	}
	
	public String getDescription() {
		return tree.getDescription() + ", Ribbons";
	}
	
	public double cost() {
		return 2.00 + tree.cost();
	}
}
