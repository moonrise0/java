package com.kbstar.frame;

public interface Service <K,V>{ //두개의 타입을 미리 선언 GENERIC
	public void register(V v) throws Exception;
	public void remove(K k) throws Exception;
	public void modify(V v) throws Exception;
	


}
