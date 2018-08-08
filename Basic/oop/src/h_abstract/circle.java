package h_abstract;

public abstract class circle extends Sharp{
	
	int r;
	
	public circle() {
		super();
	}
	
	
	public circle(int r) {
		this.r = r;
	}
	
	
	void input(){
		
	}
		
	
	double output(int r) {
		return r*r*Math.PI;
	}
		
	

}
