package bridge.ejercicio1.sinBridge;

public class Linux implements Plataforma {

	@Override
	public void plataforma() {
		System.out.print("se crea una plataforma Linux: ");

	}

	@Override
	public void arquitecturaX86() {
		System.out.println("arquitectura X86");

	}

	@Override
	public void arquitecturaX64() {
		System.out.println("arquitectura x64");

	}

}
