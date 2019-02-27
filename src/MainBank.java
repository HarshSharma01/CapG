class ReserveBank {
	private static String username;
	private static int password;   
	static String bankName="SBI";
	  static String ifscode="SBI1234";
	  static String branchName="Hyd";
	  private int accountNo;
	  public void welcomeCustomer(){
		   System.out.println("Welcome to"+bankName); 
	  }
	  public int getAccountNo(){
		   return accountNo;
      }
	  public void setAccountNo(int newAccNo){ 
	       accountNo = newAccNo;
	  }
	  public String getUsername(){
			   return username;
	  }
      public void setUsername(String newUsername){ 
		       username = newUsername;
	  }
      public int getPassword(){
			   return password;
      }
      public void setPassword(int newPassword){ 
		       password = newPassword;
		  }
      public void verifyCredentials(String usn,int pwd){
    	  if(usn==username)
    	  {
    		  if(pwd==password)
    		  {
    			  System.out.println("Verified");
    		  }
    		  else
        	  {
        		  System.out.println("Check again");
        	  }
    	  }
    	  
      }
}

interface BankingSystem{
	public void transaction();
	public void modeOfPayment();
}

class OnlineBanking extends ReserveBank implements BankingSystem
{
	float rateOfInterest=2.5f;
	public void transaction() {		
		System.out.println("Doing onlinebanking transaction");
		//if(getPassword()==password)
		//System.out.println("Password Verified");
	}
	public void modeOfPayment() {
		System.out.println("Rate of interest is "+rateOfInterest+" and it is paid using Card");
	}
}

class OfflineBanking extends ReserveBank implements BankingSystem
{
	float rateOfInterest=2.3f;
    
	public void transaction() {		
		System.out.println("Doing offlinebanking transaction");
	}
	public void modeOfPayment() {
		System.out.println("Rate of interest is "+rateOfInterest+" and it is paid using Cash");
	}
}

class MainBank {
	public static void main(String args[])
		{	
		OfflineBanking offBankDetails=new OfflineBanking();
		OnlineBanking onBankDetails=new OnlineBanking();
		System.out.println("Name of Bank "+ReserveBank.bankName);
		System.out.println("IFSC Code is "+ReserveBank.ifscode);
		System.out.println("Branch name is "+ReserveBank.branchName);
		onBankDetails.setAccountNo(1234);
		onBankDetails.setUsername("Harsh");
		onBankDetails.setPassword(1233);
		offBankDetails.setAccountNo(1212);
		offBankDetails.transaction();
		System.out.println("Account No is "+offBankDetails.getAccountNo());
		offBankDetails.modeOfPayment();
		onBankDetails.transaction();
		System.out.println("Account No is "+onBankDetails.getAccountNo());	
		onBankDetails.modeOfPayment();
		onBankDetails.verifyCredentials("Harsh", 1233);
	    }
	}