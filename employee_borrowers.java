package Book;

public class employee_borrowers extends borrowers{
	
	private int borrowers_employee_id;  //employee id

	//class constractor
	public employee_borrowers(String name, int snn, int phone, int employee_id) {
		super(name, snn, phone); //super constractor
		this.borrowers_employee_id = employee_id;
	}

	//Getter and Setter for employee id
	public int getEmployee_id() {
		return borrowers_employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.borrowers_employee_id = employee_id;
	}
	
	//employee borrowers information
	public void employee_borrowers_inf() {
		System.out.println("Employee Name    : " +super.getName());
		System.out.println("Employee SNN     : " +super.getSnn());
		System.out.println("Employee phone   : " +super.getPhone());
		System.out.println("Employee address : " +super.getAddress());
		System.out.println("Employee ID      : " +this.borrowers_employee_id);
	}
}
