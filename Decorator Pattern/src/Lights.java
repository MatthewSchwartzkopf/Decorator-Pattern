
public class Lights extends TreeDecorator {
	Tree tree;

	public Lights(Tree tree) {
		this.tree = tree;
	}
	
	public String getDescription() {
		return tree.getDescription() + ", Lights";
	}
	
	public double cost() {
		return 5.00 + tree.cost();
	}
}
