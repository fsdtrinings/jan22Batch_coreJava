package p1;

public class Employee {

	private int id;
	private String name;
	private int salary;
	private Project project;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, int salary, Project project) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.project = project;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	@Override
	public String toString() {
		return id+" - "+name+" - "+salary+" - "+project.getProjectName();
	}
	
	
}
