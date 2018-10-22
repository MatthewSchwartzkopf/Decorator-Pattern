
public class Ruffles extends TreeDecorator {
	Tree tree;

	public Ruffles(Tree tree) {
		this.tree = tree;
	}

	@Override
	public String getDescription() {
		return tree.getDescrption() + ", Ruffles";
	}

	public double cost() {
		return 1.00 + tree.cost();
	}

	@Override
	public void print() {};
}
