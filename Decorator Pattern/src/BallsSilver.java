
public class BallsSilver extends TreeDecorator {
	Tree tree;

	public BallsSilver(Tree tree) {
		this.tree = tree;
	}
	
	public String getDescription() {
		return tree.getDescription() + ", Balls Silver";
	}
	
	public double cost() {
		return 3.00 + tree.cost();
	}
}
