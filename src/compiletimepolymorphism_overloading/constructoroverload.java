package compiletimepolymorphism_overloading;

public class constructoroverload {
	constructoroverload(){
		System.out.println("Default");
	}
	
	constructoroverload(int a){
		System.out.println("Integer parameter");
	}
	
	constructoroverload(int a,int b){
		System.out.println("two integer parameters");
	}
	
	constructoroverload(String a){
		System.out.println("String parameters");
	}
	
	public static void main(String[] arg) {
		constructoroverload co= new constructoroverload();
		constructoroverload co4= new constructoroverload(); //it is called second time but with different object name
		constructoroverload co1= new constructoroverload(10);
		constructoroverload co2= new constructoroverload(10,20);
		constructoroverload co3= new constructoroverload("kbp");
	}

}
/*Here the constructor is overloaded having same name diff. parameters
 * and can call only once using 1 object which is act as a local variable for main class*/
 