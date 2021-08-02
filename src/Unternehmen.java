import java.util.ArrayList;

public class Unternehmen {
	private ArrayList<Mitarbeiter> mitarbeiter = new ArrayList<Mitarbeiter>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void mitarbeiterEinstellen(Mitarbeiter m) {
		mitarbeiter.add(m);
	}

	public void mitarbeiterKündigen(Mitarbeiter m) {
		mitarbeiter.remove(m);
	}
}
