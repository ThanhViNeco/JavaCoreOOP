package secion15.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import secion15.model.Person;

public class ListExamImpl implements ListExam {
	PersonService personService = new PersonServiceImpl();

	@Override
	public List<Person> input() {
		List<Person> list = new ArrayList<Person>();

		while (true) {

			Person person = new Person();

			personService.input(person);
			list.add(person);

			System.out.println("Tiep tuc khong  ? ");

			Scanner scanner = new Scanner(System.in);
			String option = scanner.nextLine();

			if (option.equalsIgnoreCase("k")) {
				break;

			}
		}
		return list;

	}

	@Override
	public void filter(List<Person> list) {
		System.out.println("Nguoi co tuoi nho hon 20.");
		// TODO Auto-generated method stub
		for (Person person : list) {
			if (person.getTuoi() < 20) {
				personService.info(person);

			}
		}
	}

	@Override
	public void info(List<Person> list) {

		// TODO Auto-generated method stub
		System.out.println("List ban dau : ");
		for (Person person : list) {
			personService.info(person);
		}
	}

	@Override
	public void delete(List<Person> list) {

		Iterator<Person> itr = list.iterator();
		// TODO Auto-generated method stub
		while(itr.hasNext()) {
			Person p=itr.next();
			if (p.getNameString().contains("a")|| p.getNameString().contains("A")) {
				itr.remove();
				
			}
		}
		System.out.println("List sau khi xoa : ");
		info(list);
	}

	@Override
	public void sort(List<Person> list) {
		// TODO Auto-generated method stub
		System.out.println("Tuoi tang dan : ");

		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return (o1.getTuoi() - o2.getTuoi());
			}
		});
		for (Person person : list) {
			personService.info(person);
		}
		System.out.println("------------");
		System.out.println("Tuoi giam dan : ");

		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return (o2.getTuoi() - o1.getTuoi());
			}
		});
		for (Person person : list) {
			personService.info(person);
		}
		System.out.println("------------");
	}

}
