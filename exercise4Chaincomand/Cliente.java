package exercise4Chaincomand;

import java.util.HashMap;

public class Cliente {

	public static void main(String[] args) {
		HashMap<String, Integer> map= new HashMap<>();
		map.put("Certificado de nacimiento, Pago al Banco, Ficha",0);
		map.put("Pago al Banco,Ficha",195);
		map.put("Certificado de nacimiento,Ficha",295);
		map.put("Ficha", 390);
		map.put("Pago al Banco",390 );
		map.put("Certificado de nacimiento",390 );
		Organizador organizador = new Organizador();
		organizador.criteriaHandler(map.get("Certificado de nacimiento,Ficha"));
		


	}

}
