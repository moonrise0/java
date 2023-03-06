package db;

public class OracleDAO implements DAO {

	@Override
	public void insert(Object obj) {
     System.out.println (obj);
     System.out.println ("Inserted oracle database");
	}

	@Override
	public void delete(Object obj) {
		System.out.println (obj);
	     System.out.println ("Deleted oracle database");
		}

	@Override
	public void update(Object obj) {
		System.out.println (obj);
	     System.out.println ("Upadated oracle database");
		}


}
