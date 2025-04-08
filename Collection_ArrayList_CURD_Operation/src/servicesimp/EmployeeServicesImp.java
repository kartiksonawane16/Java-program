package servicesimp;

import java.util.ArrayList;
import java.util.List;

import model.Employee;
import services.EmployeeServices;

public class EmployeeServicesImp implements EmployeeServices{
	
	List<Employee> listOfEmployees = new ArrayList<Employee>();
	
	public Employee addEmployeeData(Employee e) {
		
		listOfEmployees.add(e);
		return e;
		
	}
	
	

}
