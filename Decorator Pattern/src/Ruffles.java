
public class Ruffles extends TreeDecorator {
	Tree tree;

	public Ruffles(Tree beverage) {
		this.tree = beverage;
	}
	
	public String getDescription() {
		return tree.getDescription() + "\t Ruffles($1.00) \n";
	}
	
	public double cost() {
		return 1.00 + tree.cost();
	}
}
