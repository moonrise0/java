package ws0314;

import com.sun.nio.sctp.Association;
import com.sun.nio.sctp.Notification;

public class NotificationImpl implements Notification {
    
    public void sendEmail(String email, String msg) throws Exception {
        System.out.printf("%s에게 %s 전송....by Email\n",email,msg);
    }

   
    public void sendSMS(String contact, String msg) throws Exception {
        System.out.printf("%s에게 %s 전송....by SMS\n", contact,msg);
    }

	@Override
	public Association association() {
		// TODO Auto-generated method stub
		return null;
	}
}
