package string;

public class Immutable {
	int x;
	Immutable(int x){
		this.x=x;
	}
	
	public Immutable change(int x) {
		if(this.x==x) {
			return this;
		}
		else {
			return new Immutable(x);
		}
	}
	
	public static void main(String args) {
		Immutable i= new Immutable(10);
		
	}
}
