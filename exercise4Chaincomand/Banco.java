package exercise4Chaincomand;

public interface Banco {
	public void setNext(Banco handler);
	public Banco next();
	public void criteriaHandler(int amount);
}
