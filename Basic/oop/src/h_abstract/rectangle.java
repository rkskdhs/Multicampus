package h_abstract;

public abstract class rectangle extends Sharp {
	int h;
	int w;
	
	public rectangle() {
		super();
	}
	public rectangle(int w, int h) {
		this.h = h;
		this.w = h;
	}
	
	 void input() {
		
	}
	int output(int h, int w) {
		return h*w;
	}
}
