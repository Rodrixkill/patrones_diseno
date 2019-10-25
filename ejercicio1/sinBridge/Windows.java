package bridge.ejercicio1.sinBridge;

public class Windows implements Plataforma{

	@Override
	public void plataforma() {
		System.out.print("se crea una plataforma Windows: ");

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
