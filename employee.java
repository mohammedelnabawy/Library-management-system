package Book;

public class employee extends person{
	
	private String jop_title;   //employee jop title
	
	private int employee_id;    //employee id
	private int salary;         //all employee salary
	
	
	//class constractor
	public employee(String name, int snn, int phone, int employee_id, int salary) {
		super(name,snn,phone);           //inheritance constructor 
		this.employee_id = employee_id;
		this.salary = salary;
	}

	
	//Getter and Setter for the employee jop title
	public String getJop_title() {
		return jop_title;
	}

	public void setJop_title(String jop_title) {
		this.jop_title = jop_title;
	}

	
	//Getter and Setter for employee id
	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	
	//Getter and Setter for employee salary
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	//employee information
	public void employee_inf() {
		System.out.println("Employee Name      : " +super.getName());
		System.out.println("Employee SNN       : " +super.getSnn());
		System.out.println("Employee phone     : " +super.getPhone());
		System.out.println("Employee jop_title : " +this.jop_title);
		System.out.println("Employee salary    : " +this.salary);
		System.out.println("Employee address   : " +super.getAddress());
		System.out.println("Employee ID        : " +this.employee_id);
	}
}
