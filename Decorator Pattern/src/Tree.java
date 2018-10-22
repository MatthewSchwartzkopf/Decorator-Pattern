
public abstract class Tree {

	String description = "Template Tree";
	boolean hasStar = false;
	
	public String getDescrption() {
		return description;
	}
	
	public abstract double cost();

	public abstract void print();
}
