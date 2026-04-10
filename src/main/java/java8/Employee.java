package java8;

public class Employee {

	private String name;
	private String age;
	private String dept;
	private int salary;

	public Employee(String name, String age, String dept, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}

	public String getDept() {
		return dept;
	}

	public long getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", dept=" + dept + ", salary=" + salary + "]";
	}

}
