public class DecoratorTest {
	
	public static void main(String[] args) {
		
		Tree blueSpruce = new BlueSpruce();
		System.out.println(blueSpruce.getDescription() + " $" + blueSpruce.cost());
		
		Tree balsamFir = new BalsamFir();
		balsamFir = new Star(balsamFir);
		balsamFir = new Ruffles(balsamFir);
		balsamFir = new BallsRed(balsamFir);
		balsamFir = new BallsSilver(balsamFir);
		balsamFir = new BallsBlue(balsamFir);
		balsamFir = new Ribbons(balsamFir);
		balsamFir = new Lights(balsamFir);
		balsamFir = new LEDs(balsamFir);
		System.out.println(balsamFir.getDescription() + " $" + balsamFir.cost());
		
		Tree fraserFir = new FraserFir();
		fraserFir = new Ruffles(fraserFir);
		fraserFir = new Ribbons(fraserFir);
		fraserFir = new Star(fraserFir);
		System.out.println(fraserFir.getDescription() + " $" + fraserFir.cost());
		
		Tree douglasFir = new DouglasFir();
		douglasFir = new LEDs(douglasFir);
		douglasFir = new BallsSilver(douglasFir);
		douglasFir = new Ruffles(douglasFir);
		douglasFir = new Star(douglasFir);
		System.out.println(douglasFir.getDescription() + " $" + douglasFir.cost());
	}
}
