package db; //클래스만들때  ADD

public class MariaDBDAO implements DAO {

	@Override
	public void insert(Object obj) {
	     System.out.println (obj);
	     System.out.println ("Inserted MariaDB database");
		}
	
	
	@Override
	public void delete(Object obj) {
		System.out.println (obj);
	     System.out.println ("Deleted MariaDB database");
		}

	@Override
	public void update(Object obj) {
		System.out.println (obj);
	     System.out.println ("Updated MariaDB database");
		}

}
