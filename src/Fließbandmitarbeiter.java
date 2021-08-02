
public class Fließbandmitarbeiter extends Mitarbeiter {
	public Fließbandmitarbeiter(double gehalt) {
		super(gehalt);
		// TODO Auto-generated constructor stub
	}

	private static final double STÜCKLOHN = 14d;

	public double getGehalt(int stück) {
		return STÜCKLOHN * stück;
	}
}
