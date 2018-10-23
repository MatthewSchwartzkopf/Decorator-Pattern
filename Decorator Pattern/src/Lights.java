
public class Lights extends TreeDecorator {
	Tree tree;

	public Lights(Tree tree) {
		this.tree = tree;
	}

	public String getDescription() {
		return tree.getDescription() + "\t Lights($5.00) \n";
	}

	public double cost() {
		return 5.00 + tree.cost();
	}
}
