package exercise4Chaincomand;

public class ResponsableCarnetizacion implements Banco{
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
		if(amount < 100){
			System.out.println("Tarea atendida por Responsable Carnetizacion");
		}else{
			next.criteriaHandler(amount);
		}

	}

}
