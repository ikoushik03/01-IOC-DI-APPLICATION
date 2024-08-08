package in.koushik.bean;

public class DieselEngine implements IEngine{
	
	public DieselEngine()
	{
		System.out.println("DieselEngine constructor called");
	}

	@Override
	public int start() {
		System.out.println("DieselEngine Started");
		return 1;
	}

}
