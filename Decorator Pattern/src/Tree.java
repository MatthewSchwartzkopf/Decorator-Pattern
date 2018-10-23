
public abstract class Tree {
	String description = "Unknown tree";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
