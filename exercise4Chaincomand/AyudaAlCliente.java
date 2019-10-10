package exercise4Chaincomand;



public class AyudaAlCliente implements Banco {

private Banco next; 
	
	@Override
	public void setNext(Banco handler) {
		next=handler;

	}

	@Override
	public Banco next() {
		// TODO Auto-generated method stub
		return next;
	}

	@Override
	public void criteriaHandler(int amount) {
		if(amount < 400){
			System.out.println("Tarea atendida por Ayuda al cliente");
		}else{
			next.criteriaHandler(amount);
		}

	}

}
