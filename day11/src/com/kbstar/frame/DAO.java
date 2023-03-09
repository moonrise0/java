package com.kbstar.frame;

import java.util.List;

public interface DAO<K,V> {          //제네릭 상속받아서 나중에선택해서 쓰세요 ,dao는 데이터베이스의 입력, 삭제, 등등을 정의
    
	
	 public void insert(V v) throws Exception; 
     public void delete(K k) throws Exception;
     public void update(V v) throws Exception;
     public V select(K k) throws Exception;
     public List<V> select() throws Exception; //새로운기능을 정의할떄 하위애들이 진짜 쓰는지.
	
}
