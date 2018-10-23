
public class Star extends TreeDecorator {
	Tree tree;

	public Star(Tree beverage) {
		this.tree = beverage;
	}
	
	public String getDescription() {
		return tree.getDescription() + ", Star";
	}
	
	public double cost() {
		return 4.00 + tree.cost();
	}
}
