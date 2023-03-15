package ws0314;

import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLRecoverableException;
import java.util.List;

public class CustCRUDServiceImpl implements CRUDService<String, Cust> {

	DAO<String, String, Cust> dao;

	public CustCRUDServiceImpl() {
		dao = new CustDaoImpl();
	}

	
	
	
	@Override
	public void register(Cust v) throws Exception {
		// 데이터 검증
		// DB 입력

		try {
			dao.insert(v);
		} catch (Exception e) {
			if (e instanceof SQLIntegrityConstraintViolationException) {
				throw new Exception("ID가 중복되었습니다.");
			} else {
				throw new Exception("시스템장애입니다.");
			}
		}

	}

	@Override
	public void modify(Cust v) throws Exception {
		try {
			dao.update(v);
		} catch (Exception e) {

		}

	}

	@Override
	public void remove(String k) throws Exception {
		try {
			dao.delete(k);
		} catch (Exception e) {

			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애");
			} else {
				throw new Exception("id 장애");
			}
		}

	}

	@Override
	public Cust get(String k) throws Exception {
		// TODO Auto-generated method stub
		Cust cust = null;
		try {
		cust = dao.select(k);
		}catch(Exception e) {
			if(e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애입니다.");
			}else {
				throw new Exception("ID가 존재 하지 않습니다");
			}
		}
		return cust;
	}

	@Override
	public List<Cust> get() throws Exception {
		List<Cust> list = null;
		
	    try {
		list = dao.selectAll();   //이거 안해주면 화면에 이상한 거 뜸.
	    }catch(Exception e) {
	    	if(e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애입니다.");
			}else {
				throw new Exception("ID가 존재 하지 않습니다");
			}
	    }
		return list;
	}

}
