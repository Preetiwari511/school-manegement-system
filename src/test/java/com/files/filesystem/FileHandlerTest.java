package com.files.filesystem;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FileHandlerTest {
	private FileHandler fileHandler = new FileHandlerImpl();
	
	@Test
	public void isExistsTest(){
		boolean isExists = fileHandler.isExists("C:\\Users\\preeti.tiwari\\preeti\\test\\gogetdel\\primary.txt");
		assertTrue(isExists);
	}
	
	@Test
	public void createIfNotExistsTest(){
		boolean createIfNotExists = fileHandler.createIfNotExist("C:\\Users\\preeti.tiwari\\preeti\\test\\gogetdel\\primary2.txt ");
		assertTrue(createIfNotExists);
	}
	
	@Test
	public void DeleteTest(){
		boolean deleteTest = fileHandler.delete("C:\\Users\\preeti.tiwari\\preeti\\test\\gogetdel\\primary2.txt");
		assertTrue(deleteTest);
	}
	

}
