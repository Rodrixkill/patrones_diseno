package bridge.ejercicio1ConBridge;

public class Linux implements IPlataforma {
	private Arquitectura arquitectura;
	public Linux(Arquitectura arquitectura) {
		this.arquitectura=arquitectura;
	}
	@Override
	public void plataforma() {
		System.out.print("Se crea una plataforma Linux: ");
		arquitectura.programar();
	}

}
