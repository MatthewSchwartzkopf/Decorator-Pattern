
public abstract class Tree {
	String description = "Unknown tree";
	Tree tree;
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();

	public Tree print(Tree tree) {
		System.out.println(tree.getDescription());
		return tree;
	}
}
