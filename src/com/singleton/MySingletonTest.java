package com.singleton;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import org.junit.Assert;
import org.junit.jupiter.api.Test;






class MySingletonTest {


	MySingleton mySingleton =  MySingleton.getInstance();



	@Test
	void testForSameInstance() {
		MySingleton dupInstance = MySingleton.getInstance();
		Assert.assertSame(dupInstance, mySingleton);

	}


	@Test
	public void testForCloning() {
		Exception exception = assertThrows(CloneNotSupportedException.class, () -> {
			MySingleton dup = mySingleton.clone();
		});
		assertTrue(exception instanceof CloneNotSupportedException);
	}



	@Test
	public void testWithReflection() {

		Throwable exception = null;
		Constructor<?>[] constructors = MySingleton.class.getDeclaredConstructors();
		for (Constructor<?> constructor : constructors) {
			if (Modifier.isPrivate(constructor.getModifiers())) {
				constructor.setAccessible(true);
				exception = assertThrows(InvocationTargetException.class, () -> {
					MySingleton dup = (MySingleton) constructor.newInstance();
				});
			}
			assertTrue(exception instanceof InvocationTargetException);

		}



	}


	@Test
	public void testWithDeserialization() throws IOException, ClassNotFoundException {
		File file =  new File("abc.txt");
		file.createNewFile();
		FileOutputStream fileOp  = new FileOutputStream(file);
		ObjectOutputStream os = new ObjectOutputStream(fileOp);

		os.writeObject(mySingleton);

		FileInputStream fileIn  = new FileInputStream(file);
		ObjectInputStream in = new ObjectInputStream(fileIn);
		MySingleton dup = (MySingleton) in.readObject();

		Assert.assertSame(mySingleton, dup);



	}

}


