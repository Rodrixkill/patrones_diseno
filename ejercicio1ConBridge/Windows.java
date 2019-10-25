package bridge.ejercicio1ConBridge;

public class Windows implements IPlataforma {
	private Arquitectura arquitectura;
	public Windows(Arquitectura arquitectura) {
		this.arquitectura=arquitectura;
	}
	@Override
	public void plataforma() {
		System.out.print("Se crea una plataforma Windows: ");
		arquitectura.programar();
	}

}
