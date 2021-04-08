package ro.ase.cts.adapterClase;



public class Main {

	public static void afiseazaInformatiiCredit(Creditable credit) {
		credit.oferaCredit();
	}
	
	public static void main(String[] args) {
		Leasing leasing = new Leasing("Popescu");
		LeasingAdapter adapter = new LeasingAdapter(leasing);
		
		LeasingAdapterClase leasingAdapterClase = new LeasingAdapterClase("Ionescu");
		afiseazaInformatiiCredit(leasingAdapterClase);
	}

}