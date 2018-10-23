
public class Ruffles extends TreeDecorator {
	Tree tree;

	public Ruffles(Tree beverage) {
		this.tree = beverage;
	}
	
	public String getDescription() {
		return tree.getDescription() + ", Ruffles";
	}
	
	public double cost() {
		return 1.00 + tree.cost();
	}
}
