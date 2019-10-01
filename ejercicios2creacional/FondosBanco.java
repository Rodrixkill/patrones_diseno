package ejercicios2creacional;

public class FondosBanco {
	private static FondosBanco instance= null;
	private int dinero;
	private FondosBanco(int dinero) {
		this.dinero=dinero;
	}
	public static FondosBanco getInstance() {
		if(instance==null)instance= new FondosBanco(100000);
		return instance;
	}
	public int getDinero() {
		return dinero;
	}
	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

}
