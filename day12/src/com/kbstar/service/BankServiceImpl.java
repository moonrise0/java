/**
 * 
 */
package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.AccountDAO;
import com.kbstar.dao.UserDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.BankService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.MakeAccountNumber;
import com.kbstar.frame.Notification;
import com.kbstar.noti.NotificationImpl;

/**

 *
 */
public class BankServiceImpl implements 
BankService<UserDTO, AccountDTO, TransactionDTO , String>, BankService<AccountDTO, TransactionDTO, UserDTO, String, String> {
                                      
	DAO<String, UserDTO> userDao;
	DAO<String, AccountDTO> accountDao;
	DAO<String, TransactionDTO> transactionDao;
	Notification notification;

	public BankServiceImpl() {
		userDao = new UserDAO();
		accountDao = new AccountDAO();
		transactionDao = new Transaction DAO();
		notification = new NotificationImpl();
	}

	@Override
	public void register(UserDTO v) throws Exception {
		try {
			userDao.insert(v);
		} catch (Exception e) {
			throw new Exception("등록오류");

		}
		notification.sendEmail(v.getEmail(), "축하합니다");
		notification.sendSMS(v.getContact(), "축하합니다");

	}

	@Override

	public UserDTO login(String k, String p) throws Exception {
	    UserDTO user = null;
	    user = userDao.select(k);
		if(user != null) {
			if(user.getPwd().equals(p)) {
				System.out.println("OK");
			}else {
				throw new Exception("로그인 실패");
			}
		}else {
			    throw new Exception("로그인 실패");
		}
		return user;
	}

	@Override
	public UserDTO getUserInfo(String k) throws Exception {
		UserDTO user = null;
		user = userDao.select(k);
		return user;
	}

	@Override
	public void makeAccount(String k, double balance) throws Exception {
		AccountDTO account = new AccountDTO (MakeAccountNumber.makeAccNum() , balance , k);
		accountDao.insert(account);
		UserDTO user = userDao.select(k);
		notification.sendEmail(user.getEmail(), accNo+" 계좌를 만들었습니다.");
		

	}

	@Override
	public List<TransactionDTO> getAllTr(String acc) throws Exception {
		
		return null;
	}

	
	
	
	@Override
	public void transaction(String sendAcc, String receiveAcc, double balance, String desc) throws Exception {
	     System.out.println("전송");
	      //계좌 정보 수정   
          AccountDTO acc = null;
	      acc = accountDao.select(sendAcc);
	      double abalance = acc.getBalance() - balance;
	      acc.setBalance(abalance);
	      accountDao.update(acc);
	     //계좌 정보 수정
	     //계좌 잔액 정보 조회 - 
	     // 잔액에서 이체하는 금액 차감하고 수정(잔액이 이체하는 금액보다 많으면)
	    
	     TransactionDTO trs = new TransactionDTO(desc, sendAcc, balance, "O", desc);
	     transactionDao.insert(trs);
	 
	     
	     // 거래내역추가 //완료 
	     
	     System.out.println("전송");
	     AccountDTO acc = null;
	     acc = accountDao.select(sendAcc);
	     double ablance = acc.getBalance() - balance;
	     acc.setBalance(ablance);
	     accountDao.update(acc);
	     
		
		
		
		
		

	}
	
	
	
	
	
	

	@Override
	public UserDTO login(String k, String p) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO getUserInfo(String k) throws Exception {
		// TODO Auto-generated method stub
	
		return null;
	}
	
	
	String uid = acc.getHolder();
	UserDTO u = userDao.select(uid);
	notification.sendEmail(u.getEmail(), sendAcc+ "에서 "+ balance + "출금되었습니다");
	
	
	notification.sendSMS(u.getContact(), uid);
	
	
	
	
	
	
	
	

	@Override
	public List<AccountDTO> getAllAccount(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO login(String k, String p) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO getUserInfo(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO login(String k, String p) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO getUserInfo(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO login(String k, String p) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO getUserInfo(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
