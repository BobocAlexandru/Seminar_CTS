package ro.ase.cts.main;

import ro.ase.cts.DepartamentFinanciar;
import ro.ase.cts.clase.DepartamentFinanciarEager;

public class Main {
	public static void main(String[] args) {
		DepartamentFinanciarEager departamentFinanciarEager1= DepartamentFinanciarEager.getInstance();
		DepartamentFinanciarEager departamentFinanciarEager2 = DepartamentFinanciarEager.getInstance();
	   System.out.println(departamentFinanciarEager1.toString());
	   System.out.println(departamentFinanciarEager2.toString());
	   
	   departamentFinanciarEager1.setDirector("Gigel");
	   departamentFinanciarEager2.setNrAngajati(20);
	   System.out.println(departamentFinanciarEager2.toString());
	   System.out.println(departamentFinanciarEager2.toString());
	   
	   DepartamentFinanciar primuldepartamentFinanciar = DepartamentFinanciar.getInstance(20, "Popescu", 2500);
	   DepartamentFinanciar alDoileadepartamentFinanciar = DepartamentFinanciar.getInstance(30,"Avramescu", 2700);
	   
	   System.out.println(primuldepartamentFinanciar.toString());
	   System.out.println(alDoileadepartamentFinanciar.toString());
	}

}
