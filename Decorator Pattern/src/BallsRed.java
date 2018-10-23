
public class BallsRed extends TreeDecorator {
	Tree tree;

	public BallsRed(Tree tree) {
		this.tree = tree;
	}
	
	public String getDescription() {
		return tree.getDescription() + ", Balls Red";
	}
	
	public double cost() {
		return 1.00 + tree.cost();
	}
}
