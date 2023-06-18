package comparator;


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
		
		
		//sorting based on ID
		System.out.println("=====before sorting the list based on ID=====");
		for(Employee emp :employees)
		{
			System.out.println(emp);
		}
		Collections.sort(employees,new IdComparator());
		
		System.out.println("=====after sorting the list based on ID=====");
		for(Employee emp :employees)
		{
			System.out.println(emp);
		}
		
		//sorting Based on Name
		System.out.println("=====before sorting the list based on name=====");
		for(Employee emp :employees)
		{
			System.out.println(emp);
		}
		Collections.sort(employees,new NameComparator());
		
		System.out.println("====after sorting the list based on name====");
		for(Employee emp :employees)
		{
			System.out.println(emp);
		}
		
		employees.add(new Employee(89,"bhupesh",LocalDateTime.now(),3487L));
		
		//sorting Based on Name
				System.out.println("=====before sorting the list based on both name and id=====");
				for(Employee emp :employees)
				{
					System.out.println(emp);
				}
				Collections.sort(employees,new IdAndNameComparator());
				
				System.out.println("====after sorting the list based on both name and id ====");
				for(Employee emp :employees)
				{
					System.out.println(emp);
				}
		
	}

}
