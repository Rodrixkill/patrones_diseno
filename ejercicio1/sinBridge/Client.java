package bridge.ejercicio1.sinBridge;

final class Client {

	public static void main(String[] args) {
		Windows windows= new Windows();
		Linux linux= new Linux();
		
		windows.plataforma();
		windows.arquitecturaX64();
		
		
		linux.plataforma();
		linux.arquitecturaX86();

	}

}
