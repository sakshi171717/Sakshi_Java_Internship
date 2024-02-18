package exceptionhandling;

import java.io.*;

public class Filehandling {
	
	public void m1() throws FileNotFoundException{
		FileInputStream fp= new FileInputStream("C:/Sakshi/ip");
	}
	
	public void m2() throws FileNotFoundException{
		m1();
	}
	
	public void m3() {
		try {
			m2();
		}catch(Exception e) {
			System.out.println("File not found");
		}
	}

	public static void main(String[] args) {
		Filehandling f= new Filehandling();
		f.m3();
	}
}
