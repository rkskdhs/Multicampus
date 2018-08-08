package h_abstract;

public abstract class triangle extends Sharp{
	int w, h;
		public triangle() {
			super();
		}
		public triangle(int h, int w) {
			this.h =h;
			this.w =w;
		}
		void input() {
			
		}
		double output(int h, int w) {
			return h*w/2.0;
			
		}

}
