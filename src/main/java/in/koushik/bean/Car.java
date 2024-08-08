package in.koushik.bean;

public class Car {
	
	private IEngine eng;

	public IEngine getEng() {
		return eng;
	}
	
	public Car()
	{
		System.out.println("Car::Constructor");
	}

	public void setEng(IEngine eng) {
		System.out.println("setEng() method called");
		this.eng = eng;
	}
	
	public void start(IEngine eng)
	{
		int start = eng.start();
		if(start>=1)
		{
			System.out.println("Journey Started");
		}
		else 
		{
			System.out.println("Engine in trouble");
		}
	}
	
	

}
