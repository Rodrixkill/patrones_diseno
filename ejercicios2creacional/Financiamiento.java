package ejercicios2creacional;

public class Financiamiento implements Cajero{
	private int cost= 1000;
	@Override
	public void create() {
		int actual=FondosBanco.getInstance().getDinero();
		if (actual<cost) {
			System.out.println("ya no se puede sacar mas dinero");
		}else {
			FondosBanco.getInstance().setDinero(actual-cost);
		}
	}

}
