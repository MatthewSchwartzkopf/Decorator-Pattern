
public class BallsBlue extends TreeDecorator {
	Tree tree;

	public BallsBlue(Tree tree) {
		this.tree = tree;
	}
	
	public String getDescription() {
		return tree.getDescription() + ", Balls Blue";
	}
	
	public double cost() {
		return 2.00 + tree.cost();
	}
}
