
public class Star extends TreeDecorator {
	Tree tree;

	public Star(Tree tree) {
		this.tree = tree;
	}

	@Override
	public String getDescription() {
		return tree.getDescrption() + ", Star";
	}

	public double cost() {
		if (tree.hasStar) {
			System.out.println("Tree already has a star");
			return tree.cost();
		} else if (tree.hasStar == true){
			tree.hasStar = true;
			return 4.00 + tree.cost();
		}
		return 0;
	}

	@Override
	public void print() {}
}
