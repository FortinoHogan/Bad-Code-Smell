package lazy_before;

public class Main {

	public static void main(String[] args) {
		class Employee {
		    private String name;
		    private String department;

		    public Employee(String name, String department) {
		        this.name = name;
		        this.department = department;
		    }

		    public String getName() {
		        return name;
		    }

		}
	}

}
