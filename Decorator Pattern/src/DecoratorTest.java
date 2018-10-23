public class DecoratorTest {

	public static void main(String[] args) {
		
		Tree spruceTest = new BlueSpruce();
		System.out.println(spruceTest.getDescrption() + " $" + spruceTest.cost());
		
		Tree blueSpruce = new DouglasFir();
		blueSpruce = new Star(blueSpruce);
		System.out.println(blueSpruce.getDescrption() + " $" + blueSpruce.cost());
		
	}
}
