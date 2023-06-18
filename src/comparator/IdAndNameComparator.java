package comparator;

import java.util.Comparator;

public class IdAndNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getId()>o2.getId())
			return 1;						//by changing lessthan to greater than we can sort in reverse order
		else if(o1.getId()<o2.getId())
			return -1;
		else
			return o1.getName().compareTo(o2.getName());
	}

}
