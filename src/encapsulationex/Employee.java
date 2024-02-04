package encapsulationex;

public class Employee {

	private static final String System.out.println(emp.getEmpId()); = null;
	private int empId;
	private String name;
	private String salary;
	
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpName(String name) {
		this.name=name;
	}
	public int getEmpName() {
		return empId;
	}
	public void setEmpSalary(String salary) {
		this.salary=salary;
	}
	public int getEmpSalary() {
		return empId;
	}
	
	public static void main(String[] args) {
		Employee emp= new Employee();
		emp.setEmpId(10);
		System.out.println(emp.getEmpId());
		emp.setEmpName("xyz");
		emp.setEmpSalary("10000");
		System.out.println(emp.getEmpName());
		System.out.println(emp.getEmpSalary())
		
		
	}
}
