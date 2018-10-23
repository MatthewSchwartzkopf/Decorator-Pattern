
public class Ruffles extends TreeDecorator {
	Tree tree;

	public Ruffles(Tree tree) {
		this.tree = tree;
	}

	public String getDescription() {
		return tree.getDescrption() + ", Ruffles";
	}

	public double cost() {
		return 1.00 + tree.cost();
	}
}
