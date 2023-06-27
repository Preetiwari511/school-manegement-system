package com.files.filesystem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class FileReaderImpl implements FileReader {

	private BufferedReader bufferedReader;

	@Override
	public List<String>readFile(String fileName) {
			List<String> list = new LinkedList<String>();
		try {
			bufferedReader = new BufferedReader(new java.io.FileReader(fileName));
			String line = bufferedReader.readLine();
			while(line!= null) {
				list.add(line);
				line = bufferedReader.readLine();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		};
		
		return list;	
	}
	
//	public static void main(String[] args) {
//		FileReader fileReader = new FileReaderImpl();
//		List<String> list = new LinkedList<String>();
//		list = fileReader.readFile("C:\\Users\\preeti.tiwari\\preeti\\test\\gogetdel\\primary.txt");
//		for(String s : list) {
//			System.out.println(s);
//		}
//	}

}
