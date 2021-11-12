package hasdTable;

public class student {
	private int name;
	private int age;
	private int id;
	public student(int name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", age=" + age + ", id=" + id + "]";
	}
	
	
}
