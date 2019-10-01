package ejercicios2creacional;

public class Client {

	public static void main(String[] args) {
		Vivienda vi = new Vivienda();
		vi.create();
		System.out.println(FondosBanco.getInstance().getDinero());
	}

}
