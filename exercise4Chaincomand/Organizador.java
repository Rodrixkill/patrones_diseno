package exercise4Chaincomand;

import chainOfResponsability.Handler;

public class Organizador implements Banco {

private Banco next; 
	
	@Override
	public void setNext(Banco handler) {
		next=handler;

	}

	@Override
	public Banco next() {
		
		return next;
	}

	@Override
	public void criteriaHandler(int amount) {
		AyudaAlCliente handler3 = new AyudaAlCliente();
		Cajero handler2 = new Cajero();
		handler2.setNext(handler3);
		Notario handler1 = new Notario();
		handler1.setNext(handler2);
		ResponsableCarnetizacion handler4= new ResponsableCarnetizacion();
		handler4.setNext(handler1);
		
		this.setNext(handler4);
		
		next.criteriaHandler(amount);

	}

}
