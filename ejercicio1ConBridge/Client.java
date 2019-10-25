package bridge.ejercicio1ConBridge;

public class Client {

	public static void main(String[] args) {
		X86 x86= new X86();
		Windows windows= new Windows(x86);
		X64 x64= new X64();
		Linux linux= new Linux(x64);
		
		
		linux.plataforma();
		windows.plataforma();
	}

}
