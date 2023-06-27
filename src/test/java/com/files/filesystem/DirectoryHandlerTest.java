package com.files.filesystem;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class DirectoryHandlerTest {
	private DirectoryHandler directoryHandler = new DirectoryHandlerImpl();

	@Test
	public void isExistsTest() {
		boolean isExists = directoryHandler.isExists("C:\\Users\\preeti.tiwari\\preeti\\test\\gogetdel");
		assertTrue(isExists);
	}

	@Test
	public void createIfNotExistsTest() {
		boolean isCreated = directoryHandler.createIfNotExist("C:\\Users\\preeti.tiwari\\preeti\\test\\gogetdel1");
		assertTrue(isCreated);
	}

//	@Test
//	public void createIfNotExistsTestTrue() {
//		boolean isCreated =  directoryHandler.createIfNotExist("C:\\Users\\preeti.tiwari\\preeti\\test\\gogetdel1");
//		assertTrue(isCreated);
//	}

//	@Test
	public void deleteTest() {
		boolean isDeleted = directoryHandler.delete("C:\\Users\\preeti.tiwari\\preeti\\test\\gogetdel1");
		assertTrue(isDeleted);
	}

	@Test
	public void getFileNamesInDirectory() {
		String[] filesName = directoryHandler
				.getFileNamesInDirectory("C:\\Users\\preeti.tiwari\\preeti\\test\\gogetdel");
		assertTrue(filesName.length > 0);
	}

}
