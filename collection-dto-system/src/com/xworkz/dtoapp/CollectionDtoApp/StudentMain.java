package com.xworkz.dtoapp.CollectionDtoApp;

public class StudentMain {

	public static void main(String[] args) {

		School st = new StudentImpl();

		st.doSystem();
	

		for (String string : args) {
			System.out.println(string);
		}
	}

}
