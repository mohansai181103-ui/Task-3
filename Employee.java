package Task3;

	public class Employee {
	    private String name;
	    private int age;
	    private double salary;

	    public Employee(String name, int age, double salary) {
	        this.name = name;
	        this.age = age;
	        this.salary = salary;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public String toString() {
	        return "Employee [Name=" + name + ", Age=" + age + ", Salary=" + salary + "]";
	    }
	}



