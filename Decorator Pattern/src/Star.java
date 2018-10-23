
public class Star extends TreeDecorator {
	Tree tree;

	public Star(Tree tree) {
		this.tree = tree;
	}

	public String getDescription() {
		return tree.getDescrption() + ", Star";
	}

	public double cost() {
		return 4.0 + tree.cost();
		
		/**
		if (this.tree.hasStar) {
			System.out.println("Tree already has a star");
			return this.tree.cost();
		} else {
			this.tree.hasStar = true;
			return 4.00 + this.tree.cost();
		}
		**/
	}
}
