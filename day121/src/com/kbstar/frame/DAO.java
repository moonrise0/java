package com.kbstar.frame;

import java.util.List;

public interface DAO<K,V> {
	public void insert(V v) throws Exception;
	public void delete(K k) throws Exception;
	public void update(V v) throws Exception;
	public V select(K k) throws Exception;
	public List<V> select() throws Exception;
	public List<V> search(Object obj) throws Exception;//다 넣을 수 있는,obj 인트나 스트링 다 됨.
}
