package Familia38;

public abstract class Animal1 {
	
	private String som;
	
	abstract public void barulho(String barulho);
	
	public Animal1 (String som)
	{
		this.som = som;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}
	
	

}
