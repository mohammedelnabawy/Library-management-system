package Book;
import java.util.*; 
public class borrowers extends person {
	
    private ArrayList<hold_reqest> requests;
    
	static private int number_of_borrowers;   //number of all borrowers


	//class constractor
	public borrowers(String name, int snn, int phone) {
		super(name,snn,phone);       //super constractor
		requests = new ArrayList();
		number_of_borrowers++;
	}
	
	//name of the borrowers books
	public void borrowe_book() {	
		if(!requests.isEmpty())
		{
			System.out.println("Borrowed Books are: ");
			for(int i=0; i<requests.size();i++)
				System.out.println("["+(i+1)+"] "+requests.get(i).getBorrower_book().getBook_name());
		}
		else
			System.out.println("...No Borrowed Books in your request");
	}
	
	//Add new request
	public void set_requests(hold_reqest r) {
		requests.add(r);
	}
	
	
	//Remove a request 
	public void del_requests(int num /* the request number */) {
		for(int i=0; i < requests.size(); i++)
		{
			if(num == requests.get(i).get_request_num())
				{ 
					requests.remove(i);
					break;
				}
			else if(i == requests.size()-1 )
				System.out.println("..... Error request number .....");
		}
	}	
	
	//return number of the hold requests
	public int num_of_requests() {
		return requests.size();
	}
	
	//print information of all requests
	public void get_requests() {
		for(int i=0; i < requests.size(); i++)
		{
			requests.get(i).reqest_inf();
			System.out.println("***********************************************************");
		}
	}
	
	
	//return number of borrowrs
	public static int get_Number_of_borrowers() {
		return number_of_borrowers;
	}
}
