package bank;

import java.util.Calendar;

public class MakeAccountNumber {
	//필드가 없는 상태
	public static String MakeAccNum() {
		String accNum = ""; 
	    Calendar cal = Calendar.getInstance();
		accNum = "" + cal.get(Calendar.YEAR)
		            + (cal.get(Calendar.MONTH)+1)
		            + cal.get(Calendar.DAY_OF_MONTH)
		            + cal.get(Calendar.MILLISECOND);
				
				return accNum;
		
	}

}
