package ro.ase.cts;

public class DepartamentFinanciar {
	private int nrAngajati;
	private String director;
	private double salariuDeBaza;
	
	private static DepartamentFinanciar departamentFinanciar= null;
	private DepartamentFinanciar(int nrAngajati, String director, double salariuDeBaza)
	{
		this.director=director;
		this.nrAngajati=nrAngajati;
		this.salariuDeBaza=salariuDeBaza;
		
	}
	public static DepartamentFinanciar getInstance(int nrAngajati, String director, double salariuDeBaza)
	{
        if(departamentFinanciar==null) {
        	departamentFinanciar= new DepartamentFinanciar(nrAngajati, director, salariuDeBaza);
        }
		return departamentFinanciar;
	}
	@Override
	public String toString() {
		return "DepartamentFinanciar [nrAngajati=" + nrAngajati + ", director=" + director + ", salariuDeBaza="
				+ salariuDeBaza + "]";
	}
	public void setNrAngajati(int nrAngajati) {
		this.nrAngajati = nrAngajati;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setSalariuDeBaza(double salariuDeBaza) {
		this.salariuDeBaza = salariuDeBaza;
	}
	

}
