package secion15.service;

import java.util.List;

import secion15.model.Person;

public interface ListExam {
	List<Person> input();
	
	void filter(List<Person> list);
	
	void info(List<Person> list);
	
	void delete(List<Person> list);
	
	void sort(List<Person>list );
}
