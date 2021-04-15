package section15.main;

import java.util.List;

import secion15.model.Person;
import secion15.service.ListExam;
import secion15.service.ListExamImpl;

public class MainSection15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListExam listExamImpl = new ListExamImpl();
		
		List <Person> list = listExamImpl.input();
		
		listExamImpl.info(list);
		System.out.println("---------");
		
//		listExamImpl.filter(list);
//		System.out.println("---------");
		
		listExamImpl.sort(list);
		listExamImpl.delete(list);
	}

}
