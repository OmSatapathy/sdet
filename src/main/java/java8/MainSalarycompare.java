package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainSalarycompare {

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee("karan", "29", "IT", 3000));
		emp.add(new Employee("mukesh", "49", "ITI", 53000));
		emp.add(new Employee("dinesh", "22", "QA", 2450));
		emp.add(new Employee("mahesh", "29", "Dev", 600000));
		emp.add(new Employee("paras", "29", "Suppot", 2300));
		
		Collections.sort(emp,new ComapaingSalary());
		System.out.println(emp);
		

	}

}
