package Book;

public abstract class person {
	
	private String name;     //name
	private String address;  //address
	
	private int snn;         //snn
	private int phone;       //phone
	
	//class constractor
	public person(String name, int snn, int phone) {
		super();
		this.name = name;
		this.snn = snn;
		this.phone = phone;
	}

	//Getter and Setter for name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	//Getter and Setter for address
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	//Getter and Setter for snn
	public int getSnn() {
		return snn;
	}

	public void setSnn(int snn) {
		this.snn = snn;
	}

	//Getter and Setter for phone
	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

}
