package com.kbstar.frame;

import java.util.List;

public interface DAO<K,V> {
	//CRUD (Create, Read , Update, Delete)
          public void insert(V v) throws Exception;
          public void update(V v) throws Exception;  
          public void delete(K k) throws Exception;  
          public V select(K k) throws Exception; //위와 구분되는 점은?
          public List<V> select() throws Exception; //리스트에 다 담아서 던져
}
