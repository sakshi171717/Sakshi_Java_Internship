package interfaceex;

public abstract class Cricket implements Coach{

	
	public void getSalaryGrowth() {
		
		System.out.println("10% salary growth per year");
	}

	public void getSalary() {
		System.out.println("19000");
	}

}

/*here the two methods of finance interface is implemented
 * as Cricket implements coach which is a interface
 * and finance is another interface which is extended by coach
 * hence cricket have its own properties along with coach and finance.
 */

