package ejercicios2creacional;

public class FactoryCajero {

	public static Cajero create(CajeroCreator cajerocreator) {
		Cajero cajero=null;
		switch (cajerocreator) {
			case CREDITOS:
				cajero= new Creditos();
				break;
			case FINANCIAMIENTO:
				cajero= new Financiamiento();
				break;
			case NEGOCIOS:
				cajero= new Negocios();
				break;
			case VIVIENDA:
				cajero= new Vivienda();
				break;
		
		}
		return cajero;

	}

}
