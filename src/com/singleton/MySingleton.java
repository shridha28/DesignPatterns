package com.singleton;

import java.io.Serializable;

public class MySingleton implements Cloneable, Serializable{
	
	
	//early initialization
	private static MySingleton mySingleonInstance =  new MySingleton();
	
	private MySingleton() {
		if(mySingleonInstance!=null)
			throw new ExceptionInInitializerError("Cannot be Intialized");
	}
	
	
	public static MySingleton getInstance() {
		return mySingleonInstance;
	}
	
	public MySingleton clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	
	public Object readResolve() {
		return mySingleonInstance;
	}

}
