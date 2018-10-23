
public class BallsRed extends TreeDecorator {
	Tree tree;

	public BallsRed(Tree tree) {
		this.tree = tree;
	}

	public String getDescription() {
		return tree.getDescription() + "\t Balls Red($1.00) \n";
	}

	public double cost() {
		return 1.00 + tree.cost();
	}
}
