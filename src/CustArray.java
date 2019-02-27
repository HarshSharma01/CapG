import java.util.ArrayList;
import java.util.List;

public class CustArray {
	String customerName;
	String bankName;
	int accountNo;

	public CustArray(String customerName, String bankName, int accountNo) {
		this.customerName = customerName;
		this.bankName = bankName;
		this.accountNo = accountNo;
	}

	public static void main(String[] args) {
		CustArray cust1 = new CustArray("Harsh", "ICICI", 12345);
		CustArray cust2 = new CustArray("Kunal", "ICICI", 12346);
		CustArray cust3 = new CustArray("Dinesh", "SBI", 12347);
		CustArray cust4 = new CustArray("Yash", "ICICI", 12348);

		List<CustArray> obj1 = new ArrayList<CustArray>();
		obj1.add(cust1);
		obj1.add(cust2);
		obj1.add(cust3);
		obj1.add(cust4);
		
		for (CustArray allcust : obj1) { 
			 System.out.println("Name " +allcust.customerName + " Bank Name " + allcust.bankName + " Acc No " +allcust.accountNo); 
		}
	}
}
