package ro.ase.cts.facade.program;

import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.Masa;

public class Main {

	public static void main(String[] args) {
		

		Masa masa = new Masa(5,10);
		if(Facade.verificaDisponibilitateMasa(masa)) {
			System.out.println("Poftiti la masa!");
		}
		else {
			System.out.println("Mai asteptati");
		}
	}
}