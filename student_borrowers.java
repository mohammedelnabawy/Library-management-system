package Book;

public class student_borrowers extends borrowers{
	
	private int student_id;      //student id
	private String department;   //student department
	
	//class constractor
	public student_borrowers(String name, int snn, int phone, int student_id, String department) {
		super(name, snn, phone);         //super constractor
		this.student_id = student_id;
		this.department = department;
	}

	//Getter and Setter for student id
	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	
	//Getter and Setter for student department
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	//student borrowers information
	public void get_library_employee_id() {
		System.out.println("Employee Name : " +super.getName());
		System.out.println("Employee SNN : " +super.getSnn());
		System.out.println("Employee phone : " +super.getPhone());
		System.out.println("Employee address : " +super.getAddress());
		System.out.println("Employee ID : " +this.student_id);
		System.out.println("Employee ID : " +this.department);
	}
}
