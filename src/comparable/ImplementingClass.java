package comparable;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ImplementingClass {

	public static void main(String[] args) {
		
		ArrayList<Employee> employees=new ArrayList<>();
		employees.add(new Employee(1,"lokesh",LocalDateTime.now(),987L));
		employees.add(new Employee(134,"rakesh",LocalDateTime.now(),98725L));
		employees.add(new Employee(55,"ramesh",LocalDateTime.now(),934387L));
		employees.add(new Employee(89,"somesh",LocalDateTime.now(),3487L));
		
		
		System.out.println("before sorting the list ");
		for(Employee emp :employees)
		{
			System.out.println(emp);
		}
		Collections.sort(employees);
		
		System.out.println("after sorting the list ");
		for(Employee emp :employees)
		{
			System.out.println(emp);
		}

	}

}
