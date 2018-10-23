public class DecoratorTest {

	public static void main(String[] args) {

		Tree blueSpruce = new BlueSpruce();
		blueSpruce = new Ribbons(blueSpruce);
		blueSpruce.print(blueSpruce);

		Tree balsamFir = new BalsamFir();
		balsamFir = new Star(balsamFir);
		balsamFir = new Ruffles(balsamFir);
		balsamFir = new BallsRed(balsamFir);
		balsamFir = new BallsSilver(balsamFir);
		balsamFir = new BallsBlue(balsamFir);
		balsamFir = new Ribbons(balsamFir);
		balsamFir = new Lights(balsamFir);
		balsamFir = new LEDs(balsamFir);
		balsamFir.print(balsamFir);

		Tree fraserFir = new FraserFir();
		fraserFir = new Ruffles(fraserFir);
		fraserFir = new Ribbons(fraserFir);
		fraserFir = new Star(fraserFir);
		fraserFir.print(fraserFir);

		Tree douglasFir = new DouglasFir();
		douglasFir = new LEDs(douglasFir);
		douglasFir = new BallsSilver(douglasFir);
		douglasFir = new Ruffles(douglasFir);
		douglasFir = new Star(douglasFir);
		douglasFir.print(douglasFir);
	}
}
