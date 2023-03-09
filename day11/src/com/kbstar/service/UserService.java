package com.kbstar.service;

import java.util.ArrayList;
import java.util.List;

import com.kbstar.dao.UserDAO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Msg;
import com.kbstar.frame.Notification;
import com.kbstar.frame.CRUDService;
import com.kbstar.noti.NotificationImpl;

public class UserService implements CRUDService<String, UserDTO> {

	DAO<String, UserDTO> userDao;// 두군데에 갈수있다
	Notification notification;

	public UserService() {
		userDao = new UserDAO();
		notification = new NotificationImpl();
	}

	@Override
	public void register(UserDTO v) throws Exception { // exception이 발생하면 원래는 화면에 dberror 던졌는데 try 구문으로 잡기.

		// 비밀번호 암호화
		try {
			userDao.insert(v);
		} catch (Exception e) {
			throw new Exception("회원가입이 실패하였습니다.(ex0001)");  //서비스 상 고객에게 보내기.
		}

		notification.sendEmail(v.getEmail(), Msg.registerMsg1);
		notification.sendSMS(v.getContact(), Msg.registerMsg2); // 프로퍼티 형식으로 해도 됨.
	}

	@Override
	public void remove(String k) throws Exception {
	     UserDTO user = null; //고객정보 받기위한 세팅
	     user = userDao.select(k);
	     try {
	     userDao.delete(k);	 
	     }catch(Exception e) {
	    	 throw new Exception("탈퇴 오류입니다.");
	     }
	     notification.sendEmail(user.getEmail(), Msg.removeMsg1);
		 notification.sendSMS(user.getContact(), Msg.removeMsg2);
	}

	@Override
	public void modify(UserDTO v) throws Exception {
		try {
		
		userDao.update(v);
		}catch(Exception e) {
			throw new Exception("수정오류입니다");
		}
	}

	
	@Override
	public UserDTO get(String k) throws Exception {
       UserDTO obj = null;
       obj = userDao.select(k);
       return obj;
	}

	@Override
	public List<UserDTO> get() throws Exception {
		
		List<UserDTO>list = null;
		try {
		list = userDao.select();
		}catch(Exception e) {
			throw new Exception("조회 오류");
		}
		return list;
	}

}
