package com.kbstar.frame;

public interface DAO <K,V> { 
	    public static final String IP = "127.0.0.1";//(상수느낌)//
	    
	    
	    
	    public void insert(V v) throws Exception;    //퍼블릭과 보이드 사이에  abstract 가 빠졌다.
	    public void delete(K k) throws Exception;
	    public void update(V v) throws Exception;    //generic은 예상해서 만들어 놓는것 frame으로 ,
	    default void connect( ) {
	    	
	    	System.out.println(IP+ "에 접속하셨습니다.");
	    }
	    default void close() {
	    	
	    	System.out.println(IP+ "에 접속을 해제하셨습니다.");
	    }
}
