package in.koushik.bean;

public class PetrolEngine implements IEngine{
	
	public PetrolEngine() {
		System.out.println("PetrolEngine constructor called");
	}

	@Override
	public int start() {
		System.out.println("PetrolEngine Started");
		return 1;
	}
	
	

}
