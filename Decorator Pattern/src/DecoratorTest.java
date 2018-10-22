public class DecoratorTest {

	public DecoratorTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Tree blueSpruce = new BlueSpruce();
		blueSpruce = new Star(blueSpruce);
		blueSpruce = new Ruffles(blueSpruce);
		blueSpruce = new Star(blueSpruce);
		blueSpruce = new Ruffles(blueSpruce);
		blueSpruce.print();
		System.out.println(blueSpruce.getDescrption() + " $" + blueSpruce.cost());
		
		Tree balsamFir = new BalsamFir();
		balsamFir = new Star(balsamFir);
		balsamFir = new Ruffles(balsamFir);
		balsamFir = new Star(balsamFir);
		balsamFir = new Ruffles(balsamFir);
		
		Tree douglasFir = new DouglasFir();
		douglasFir = new Star(douglasFir);
		douglasFir = new Ruffles(douglasFir);
		douglasFir = new Star(douglasFir);
		douglasFir = new Ruffles(douglasFir);
		
		Tree fraserFir = new FraserFir();
		fraserFir = new Star(fraserFir);
		fraserFir = new Ruffles(fraserFir);
		fraserFir = new Star(fraserFir);
		fraserFir = new Ruffles(fraserFir);
	}

}
