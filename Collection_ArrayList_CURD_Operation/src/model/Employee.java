package model;

public class Employee {
	
	private int eid;
	private String eName;
	private int salary;
	
	// constructor
	public Employee() {
		super();
		
	}

	public Employee(int eid, String eName, int salary) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", eName=" + eName + ", salary=" + salary + "]";
	}
	
	
	
	
	
	

}
