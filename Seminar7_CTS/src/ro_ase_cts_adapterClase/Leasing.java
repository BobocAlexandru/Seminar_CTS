package ro_ase_cts_adapterClase;

public class Leasing {
	private String nume;
	
	public Leasing(String nume) {
		this.nume=nume;
	}
	
	public void oferaLeasing() {
		System.out.println("I se ofera un leasing lui "+nume);
	}
}