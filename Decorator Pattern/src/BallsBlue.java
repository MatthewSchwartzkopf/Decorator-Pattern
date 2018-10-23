
public class BallsBlue extends TreeDecorator {
	Tree tree;

	public BallsBlue(Tree tree) {
		this.tree = tree;
	}

	public String getDescription() {
		return tree.getDescription() + "\t Balls Blue(2.00) \n";
	}

	public double cost() {
		return 2.00 + tree.cost();
	}
}
