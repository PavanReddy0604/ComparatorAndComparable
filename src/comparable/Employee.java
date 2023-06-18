package comparable;

import java.time.LocalDateTime;

public class Employee implements Comparable<Employee> {
	
	private int id;
	private String name;
	private LocalDateTime joiningDate;
	private long phNum;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, LocalDateTime joiningDate, long phNum) {
		super();
		this.id = id;
		this.name = name;
		this.joiningDate = joiningDate;
		this.phNum = phNum;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDateTime getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(LocalDateTime joiningDate) {
		this.joiningDate = joiningDate;
	}
	public long getPhNum() {
		return phNum;
	}
	public void setPhNum(long phNum) {
		this.phNum = phNum;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", joiningDate=" + joiningDate + ", phNum=" + phNum + "]";
	}
	
	
	@Override
	public int compareTo(Employee o) {
		if(this.id>o.id)
		return 1;				//by changing lessthan to greater than we can sort in reverse order
		else if(this.id<o.id)
			return -1;
		else
			return 0;
	}
	
	
	

}
