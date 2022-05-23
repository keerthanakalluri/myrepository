
public class Employee2  implements Comparable<Employee2>{
public Employee2(int employeeid, String employeename, String employeedesignation, int employeeage) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.employeedesignation = employeedesignation;
		this.employeeage = employeeage;
	}
private int employeeid;
private String employeename;
private String employeedesignation;
private int employeeage;
public int getEmployeeid() {
	return employeeid;
}
public void setEmployeeid(int employeeid) {
	this.employeeid = employeeid;
}
public String getEmployeename() {
	return employeename;
}
public void setEmployeename(String employeename) {
	this.employeename = employeename;
}
public String getEmployeedesignation() {
	return employeedesignation;
}
public void setEmployeedesignation(String employeedesignation) {
	this.employeedesignation = employeedesignation;
}
public int getEmployeeage() {
	return employeeage;
}
public void setEmployeeage(int employeeage) {
	this.employeeage = employeeage;
}
@Override
public String toString() {
	return "Employee2 [employeeid=" + employeeid + ", employeename=" + employeename + ", employeedesignation="
			+ employeedesignation + ", employeeage=" + employeeage + "]";
}



}
