package ejercicios2creacional;

public class Creditos implements Cajero{
	private int cost= 500;
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
