package bank;


import bank.AccountDAO;
import bank.Account;
import bank.DAO;


public class App {

	public static void main(String[] args) {
//	 
	  DAO dao = new AccountDAO();
		Account account = new Account(String accNo, "james", String accHolder, double balance);
		dao.insert(account);
	  
	  
	  /*
		 * UserDTO user = new UserDTO("id01", "pwd01", "james"); dao.insert(user);
		 */
	  
	}

}
