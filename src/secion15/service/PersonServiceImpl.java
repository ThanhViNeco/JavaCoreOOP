package secion15.service;

import java.util.Scanner;

import secion15.model.Person;

public class PersonServiceImpl implements PersonService{
	

	@Override
	public void input(Person p) {
		// TODO Auto-generated method stub
		System.out.println("Nhap thong tin Person.");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap ID : ");
		p.setId(Integer.parseInt(scanner.nextLine()));
		
		System.out.println("Nhap tuoi : ");
		p.setTuoi(Integer.parseInt(scanner.nextLine()));
		
		System.out.println("Nhap ten : ");
		p.setNameString(scanner.nextLine());
		
		
	}

	@Override
	public void info(Person p) {
		// TODO Auto-generated method stub
		System.out.println("ID : " + p.getId());
		System.out.println("Ten : " + p.getNameString());
		System.out.println("Tuoi : " + p.getTuoi());
	}

}
