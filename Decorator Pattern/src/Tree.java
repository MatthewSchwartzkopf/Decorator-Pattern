
public abstract class Tree {
	String description = "Unknown Tree";
	boolean hasStar = false;
	Tree tree;
	
	public String getDescrption() {
		return description;
	}
	
	public abstract double cost();

}
